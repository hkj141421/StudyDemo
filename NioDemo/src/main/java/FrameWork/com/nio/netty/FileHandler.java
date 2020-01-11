package FrameWork.com.nio.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.handler.codec.http.*;
import io.netty.handler.stream.ChunkedFile;
import io.netty.util.CharsetUtil;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

import static io.netty.handler.codec.http.HttpVersion.HTTP_1_0;
import static io.netty.handler.codec.http.HttpVersion.HTTP_1_1;

/**
 * Created by forget on 2019/12/4.
 */
public class FileHandler extends SimpleChannelInboundHandler<FullHttpRequest>{



    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, FullHttpRequest fullHttpRequest) throws Exception {
        String reqpath = "";
        reqpath=URLDecoder.decode(fullHttpRequest.uri(),CharsetUtil.UTF_8.toString());

        String path="C:\\Users\\forget\\Desktop\\个人";

        if(!reqpath.equals("/")){
            reqpath.replace("/","\\");
            path=path+reqpath;
        }
        File file=new File(path);
        if(file.exists())
        {
            if (file.isDirectory()) {
                if (fullHttpRequest.uri().endsWith("/")) {
                    System.out.println("显示文件目录");
                    this.sendFileList(channelHandlerContext,fullHttpRequest,file,reqpath);
                } else {
                    System.out.println("重定向");
                    this.sendRedirect(channelHandlerContext, fullHttpRequest.uri() + '/');
                }
                return;
            }
            else if(file.isFile())sendFile(channelHandlerContext,fullHttpRequest,file);

        }
        else sendError(channelHandlerContext,fullHttpRequest);
    }


    public void sendRedirect(ChannelHandlerContext context,String NewUri)
    {
        FullHttpResponse response=new DefaultFullHttpResponse(HTTP_1_1,HttpResponseStatus.FOUND,Unpooled.EMPTY_BUFFER);
        response.headers().set("LOCATION",NewUri);
        context.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);
    }

    public void sendFileList(ChannelHandlerContext context,FullHttpRequest request,File file,String pa)
    {
        String stringBuffer=pingHtml(file).toString();
//       StringBuffer stringBuffer=new StringBuffer();
//       stringBuffer.append("<html><head><title>文件服务器</title></head>");
//       stringBuffer.append("<body>");
//       stringBuffer.append("<ul>");
//       stringBuffer.append("<li><a href=\"../\">返回上级目录</a></li>\r\n");
////       stringBuffer.append("<li><a href='../'>返回上级目录</a></li>");
//        String p="";
//       if(file.isDirectory())
//       {
//           File[] files=file.listFiles();
//           for (File f1:files) {
//               stringBuffer.append("<li><a href=\"")
//                       .append(f1.getName())
//                       .append("\">")
//                       .append(f1.getName())
//                       .append("</a></li>\r\n");
//           }
//       }
//       stringBuffer.append("</ul></body></html>");

       FullHttpResponse response=new DefaultFullHttpResponse(HTTP_1_0,HttpResponseStatus.OK,Unpooled.copiedBuffer(stringBuffer,CharsetUtil.UTF_8));
       response.headers().set(HttpHeaderNames.CONTENT_TYPE,"text/html");
       context.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);

    }

    public StringBuilder pingHtml(File dir){

        StringBuilder buf = new StringBuilder()
                .append("<!DOCTYPE html>\r\n")
                .append("<html><head><meta charset='utf-8' /><title>")
                .append("Listing of: ")
                .append(dir.getPath())
                .append("</title></head><body>\r\n")

                .append("<h3>Listing of: ")
                .append(dir.getPath())
                .append("</h3>\r\n")

                .append("<ul>")
                .append("<li><a href=\"../\">..</a></li>\r\n");

        for (File f: dir.listFiles()) {
            if (f.isHidden() || !f.canRead()) {
                continue;
            }

            String name = f.getName();
            buf.append("<li><a href=\"")
                    .append(name)
                    .append("\">")
                    .append(name)
                    .append("</a></li>\r\n");
        }

        buf.append("</ul></body></html>\r\n");
        return buf;
    }

    public void sendError(ChannelHandlerContext context,FullHttpRequest request)
    {
        FullHttpResponse response=new DefaultFullHttpResponse(HTTP_1_0,HttpResponseStatus.OK,Unpooled.copiedBuffer(HttpResponseStatus.FOUND+"找不到文件",CharsetUtil.UTF_8));
        response.headers().set(HttpHeaderNames.CONTENT_TYPE,"text/plain");
        context.writeAndFlush(response).addListener(ChannelFutureListener.CLOSE);
    }

    public void sendFile(ChannelHandlerContext context,FullHttpRequest request,File file) throws IOException {

        RandomAccessFile accessFile=new RandomAccessFile(file,"r");
        Long len=accessFile.length();

        HttpResponse response=new DefaultHttpResponse(HTTP_1_1,HttpResponseStatus.OK);
        MimetypesFileTypeMap typeMap=new MimetypesFileTypeMap();
        response.headers().set(HttpHeaderNames.CONTENT_TYPE,typeMap.getContentType(file));

        HttpUtil.setContentLength(response,len);
        if (!HttpUtil.isKeepAlive(request)) {
            response.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.CLOSE);
        } else if (request.protocolVersion().equals(HTTP_1_0)) {
            response.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderValues.KEEP_ALIVE);
        }

        context.write(response);
        ChannelFuture future=context.write(new DefaultFileRegion(accessFile.getChannel(),0,len),context.newProgressivePromise());
        ChannelFuture channelFuture=context.writeAndFlush(LastHttpContent.EMPTY_LAST_CONTENT);

        future.addListener(new ChannelProgressiveFutureListener() {
            @Override
            public void operationProgressed(ChannelProgressiveFuture channelProgressiveFuture, long progress, long total) throws Exception {
                System.out.println("当前进度："+progress+"，总进度:"+total);
            }

            @Override
            public void operationComplete(ChannelProgressiveFuture channelProgressiveFuture) throws Exception {
                System.out.println("读取完成");

            }
        });

        if(!HttpUtil.isKeepAlive(request))
        {
            channelFuture.addListener(ChannelFutureListener.CLOSE);
        }

    }

}
