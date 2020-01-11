package FrameWork.handlers;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;


/**
 * Created by forget on 2019/12/9.
 */
public class clientHandle extends SimpleChannelInboundHandler<DatagramPacket>{

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, DatagramPacket o) throws Exception {
        System.out.println("收到服务端消息"+o.content().toString(CharsetUtil.UTF_8));
    }
}
