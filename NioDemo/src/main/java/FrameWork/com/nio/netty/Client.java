package FrameWork.com.nio.netty;

import FrameWork.com.nio.Codec.JsonDecode;
import FrameWork.com.nio.Codec.JsonEncode;
import FrameWork.com.nio.Codec.testDecode;
import FrameWork.com.nio.Codec.testEncode;
import FrameWork.com.nio.message;
import com.sun.javaws.jnl.ResourcesDesc;
import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.*;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by forget on 2019/12/2.
 */
public class Client {
    private EventLoopGroup eventLoopGroup;
    public Bootstrap Bootstrap;
    private ChannelFuture channelFuture;

    public SocketChannel channel;

    public Client() {
        this.eventLoopGroup=new NioEventLoopGroup();

    }

    public void start(){
        this.Bootstrap=new Bootstrap();
        this.Bootstrap.group(this.eventLoopGroup)
                        .channel(NioSocketChannel.class)
                        .handler(new ChannelInitializer() {
                            @Override
                            protected void initChannel(Channel channel) throws Exception {
                                ChannelPipeline pipeline=channel.pipeline();

//                                channel.eventLoop().scheduleAtFixedRate(new Runnable() {
//                                    @Override
//                                    public void run() {
//                                        System.out.println("每隔五秒打印一次:"+new Date(System.currentTimeMillis()));
//                                    }
//                                },5000,3000,TimeUnit.MILLISECONDS);
                                ByteBuf limit= Unpooled.buffer();
                                limit.writeBytes("%%%---".getBytes());

//                                pipeline.addLast(new DelimiterBasedFrameDecoder(1024,limit));
//                                pipeline.addLast(new FixedLengthFrameDecoder(64));
//                                pipeline.addLast(new ObjectDecoder(1024*1024, ClassResolvers.weakCachingConcurrentResolver(this.getClass().getClassLoader())));
//                                pipeline.addLast(new ObjectEncoder());


                                //protobuf协议添加的长度属性解码器，解决半包问题
//                                pipeline.addLast(new ProtobufVarint32FrameDecoder());
                                //ProtobufDecoder协议对象解码器
//                                pipeline.addLast(new ProtobufDecoder(FrameWork.com.nio.test.msg.getDefaultInstance()));
                                //添加长度属性，标识消息长度
//                                pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
//                                //
//                                pipeline.addLast(new ProtobufEncoder());
                                pipeline.addLast(new LengthFieldBasedFrameDecoder(10*1024*1024,0,4,0,4));
                   //             pipeline.addLast(new IdleStateHandler(true,5L,0L,0l, TimeUnit.SECONDS));
                                pipeline.addLast(new StringDecoder());
//                                pipeline.addLast(new JsonDecode(message.class));
//                                pipeline.addLast(new testDecode());
                                pipeline.addLast(new LengthFieldPrepender(4));
                                pipeline.addLast(new StringEncoder());
                                pipeline.addLast(new JsonEncode());
//                                pipeline.addLast(new testEncode());

                                pipeline.addLast(new HelloClientHandle());
                            }
                        });

        try {
            this.channelFuture=this.Bootstrap.connect("localhost",8080).sync();
            System.out.println("连接成功");
            this.channelFuture.channel().closeFuture().sync();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            ScheduledThreadPoolExecutor executor=new ScheduledThreadPoolExecutor(1);
            executor.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(10L);
                        System.out.println("正在重连......");
                        start();
                    } catch (InterruptedException e) {
                        System.out.println("失去连接"+e.getMessage());
                    }

                }
            });
        }


    }
}
