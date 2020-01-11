package FrameWork.domain;

import FrameWork.handlers.serverHandle;
import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoop;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioDatagramChannel;

/**
 * Created by forget on 2019/12/9.
 */
public class UdpServer {
    private EventLoopGroup boss;
    private Bootstrap bootstrap;

    public void start() throws InterruptedException {
        try{
            this.boss=new NioEventLoopGroup();
            this.bootstrap=new Bootstrap();

            this.bootstrap.group(this.boss)
                    .channel(NioDatagramChannel.class)
                    .option(ChannelOption.SO_BROADCAST,true)
                    .handler(new serverHandle());

            ChannelFuture future=this.bootstrap.bind(8023).sync().channel().closeFuture().await();
        }finally {
            this.boss.shutdownGracefully();
        }
    }
}
