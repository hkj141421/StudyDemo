package FrameWork.com.nio.Codec;

import FrameWork.com.nio.message;
import FrameWork.com.nio.test;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

/**
 * Created by forget on 2019/12/9.
 */
public class testDecode extends MessageToMessageDecoder{

    @Override
        protected void decode(ChannelHandlerContext channelHandlerContext, Object o, List list) throws Exception {
        System.out.println("测试解码");
        message m= (message) o;
        list.add(o);
    }

}
