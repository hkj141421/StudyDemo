package FrameWork.com.nio.netty;

import FrameWork.com.nio.message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Created by forget on 2019/12/2.
 */
public class testHandle extends SimpleChannelInboundHandler<Object>{

    private int count=0;

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端激活");
    }

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        count++;
        System.out.println("收到第"+count+"条消息");
        ByteBuf message= (ByteBuf) o;
        byte [] bytes=new byte[message.readableBytes()];
        message.readBytes(bytes);
        FrameWork.com.nio.test.msg m =FrameWork.com.nio.test.msg.parseFrom(bytes);
        System.out.println(m.getContent()+","+m.getEmail()+","+m.getNumber());
    }


    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.flush();
    }
}
