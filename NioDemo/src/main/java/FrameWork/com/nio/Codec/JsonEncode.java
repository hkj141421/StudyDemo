package FrameWork.com.nio.Codec;

import FrameWork.com.nio.message;
import com.alibaba.fastjson.JSONObject;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;

import java.lang.reflect.Field;
import java.util.List;

/**
 * Created by forget on 2019/12/6.
 */
public class JsonEncode extends MessageToMessageEncoder<message>{

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, message o, List list) throws Exception {
//       Field[] fields = o.getClass().getDeclaredFields();
//       String str="{";
//        for (Field f:fields) {
//            f.setAccessible(true);
//            str+=f.getName()+":"+f.get(o)+",";
//        }
        list.add(JSONObject.toJSON(o).toString());
    }
}
