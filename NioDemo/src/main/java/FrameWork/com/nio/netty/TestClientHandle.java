package FrameWork.com.nio.netty;

import FrameWork.com.nio.*;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by forget on 2019/12/2.
 */
public class TestClientHandle extends SimpleChannelInboundHandler<String>{

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ByteBuf byteBuf= Unpooled.buffer("hello:第n条".length());
        String m="csc";
        byte [] bytes=new byte[64];
        byte [] msg=m.getBytes();

//        for (int i = 0; i < bytes.length&&msg.length<bytes.length; i++) {
//            if (i < msg.length) {
//                bytes[i] = msg[i];
//            } else {
//                /**32 表示空格，等价于：msgBytes1[i] = " ".getBytes()[0];*/
//                bytes[i] = 32;
//            }
//        }
        message message=new message("13213213","2121212");

        FrameWork.com.nio.test.msg.Builder builder= FrameWork.com.nio.test.msg.newBuilder();
        FrameWork.com.nio.test.msg m2=builder.setContent("scsc").setEmail("670378784").setNumber(551).build();

        for (int i=0;i<50;i++)
        {
            byteBuf= Unpooled.buffer(m2.toByteArray().length);
            System.out.println(new String("hello:第"+i+"条"));
            byteBuf.writeBytes(m2.toByteArray());
            ctx.channel().writeAndFlush(m2);
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, String s) throws Exception {

    }
}
