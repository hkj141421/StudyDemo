package FrameWork.com.nio.netty;

import FrameWork.com.nio.Codec.JsonDecode;
import FrameWork.com.nio.Codec.JsonEncode;
import FrameWork.com.nio.Codec.testDecode;
import FrameWork.com.nio.Codec.testEncode;
import FrameWork.com.nio.message;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledDirectByteBuf;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.*;
import io.netty.handler.codec.http.*;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.handler.timeout.IdleStateHandler;
import io.netty.util.concurrent.DefaultThreadFactory;

import java.util.concurrent.TimeUnit;

/**
 * Created by forget on 2019/12/2.
 */
public class NettyServer {

    private EventLoopGroup worker;
    private EventLoopGroup boss;
    private ServerBootstrap serverBootstrap;

    private ChannelFuture future;

    public NettyServer() {
        this.worker=new NioEventLoopGroup(0,new DefaultThreadFactory("worker",false));
        this.boss=new NioEventLoopGroup(0,new DefaultThreadFactory("boss",false));
        this.serverBootstrap=new ServerBootstrap();
    }

    public void start(int port){
        try
        {
            this.serverBootstrap.group(this.boss,this.worker)
                    .channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer() {
                        @Override
                        protected void initChannel(Channel channel) throws Exception {
                            ChannelPipeline pipeline = channel.pipeline();
                            ByteBuf limit= Unpooled.buffer();
                            limit.writeBytes("%%%---".getBytes());

//                            pipeline.addLast(new DelimiterBasedFrameDecoder(1024,limit));
//                            pipeline.addLast(new FixedLengthFrameDecoder(64));
//                            pipeline.addLast(new ObjectDecoder(1024*1024, ClassResolvers.weakCachingConcurrentResolver(this.getClass().getClassLoader())));
//                            pipeline.addLast(new ObjectEncoder());

//                            pipeline.addLast(new ProtobufVarint32FrameDecoder());
//                            pipeline.addLast(new ProtobufDecoder(FrameWork.com.nio.test.msg.getDefaultInstance()));
//                            pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
//                            pipeline.addLast(new ProtobufEncoder());
//                            pipeline.addLast(new HttpRequestDecoder());
//                            pipeline.addLast(new HttpResponseEncoder());
//                            pipeline.addLast(new HttpServerCodec());
//                            pipeline.addLast(new HttpObjectAggregator(65536));
//                            pipeline.addLast(new ChunkedWriteHandler());
                            pipeline.addLast(new LengthFieldBasedFrameDecoder(10*1024*1024,0,4,0,4));
               //             pipeline.addLast(new IdleStateHandler(true,5L,0L,0l, TimeUnit.SECONDS));
                            pipeline.addLast(new StringDecoder());
//                            pipeline.addLast(new JsonDecode(message.class));
//                            pipeline.addLast(new testDecode());

                            pipeline.addLast(new LengthFieldPrepender(4));
                            pipeline.addLast(new StringEncoder());
                            pipeline.addLast(new JsonEncode());
//                            pipeline.addLast(new testEncode());

                            pipeline.addLast(new HelloServeHandle());
//                            pipeline.addLast(new exampleHandle());
                        }
                    });

           this.future = this.serverBootstrap.bind(port).sync();
           this.serverBootstrap.bind(8022).sync();
            System.out.println("netty服务器启动");
           this.future.channel().closeFuture().sync();

        }
        catch (Exception e)
        {
//            System.out.println("客户端断开连接");
        }
        finally {
             this.boss.shutdownGracefully();
             this.worker.shutdownGracefully();
        }
    }
}
