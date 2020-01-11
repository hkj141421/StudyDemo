package FrameWork.com.nio.Codec;

import FrameWork.com.nio.message;
import FrameWork.com.nio.test;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.util.List;

/**
 * Created by forget on 2019/12/9.
 */
public class testEncode extends MessageToMessageEncoder{

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Object o, List list) throws Exception {

        System.out.println("测试编码"+o);
        message m= (message) o;
        list.add(m);
    }
}
