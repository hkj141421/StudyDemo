package FrameWork.handlers;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import io.netty.channel.socket.DatagramPacket;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;

import java.net.InetSocketAddress;

/**
 * Created by forget on 2019/12/9.
 */
public class serverHandle extends SimpleChannelInboundHandler<DatagramPacket>{
    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, DatagramPacket o) throws Exception {
        System.out.println("收到客户端消息："+o.content().toString(CharsetUtil.UTF_8));

        channelHandlerContext.writeAndFlush(new DatagramPacket(Unpooled.copiedBuffer("helloworld".getBytes()),o.sender()));
    }
}
