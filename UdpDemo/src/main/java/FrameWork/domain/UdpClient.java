package FrameWork.domain;

import FrameWork.handlers.clientHandle;
import io.netty.bootstrap.Bootstrap;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.DatagramPacket;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.util.CharsetUtil;

import java.net.InetSocketAddress;

/**
 * Created by forget on 2019/12/9.
 */
public class UdpClient {
    private EventLoopGroup boss;
    private Bootstrap bootstrap;

    public void start() throws InterruptedException {
        try
        {
            this.boss=new NioEventLoopGroup();
            this.bootstrap=new Bootstrap();

            this.bootstrap.group(this.boss)
                    .channel(NioDatagramChannel.class)
                    .handler(new clientHandle());

            Channel channel=this.bootstrap.bind(8022).sync().channel();

            channel.writeAndFlush(new DatagramPacket(Unpooled.copiedBuffer("hello world", CharsetUtil.UTF_8),new InetSocketAddress("255.255.255.255",8023))).sync();
            channel.closeFuture().await();
        }finally {
            this.boss.shutdownGracefully();
        }

    }
}
