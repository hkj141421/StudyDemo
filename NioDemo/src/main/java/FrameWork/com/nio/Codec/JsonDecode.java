package FrameWork.com.nio.Codec;

import com.alibaba.fastjson.JSONObject;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;

/**
 * Created by forget on 2019/12/6.
 */
public class JsonDecode extends MessageToMessageDecoder<String>{

    private Class aClass;

    public JsonDecode(){

    }

    public JsonDecode(Class aClass){
        this.aClass=aClass;
    }
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, String o, List list) throws Exception {
        JSONObject jsonObject=JSONObject.parseObject(o);
        Set<String> set=jsonObject.keySet();
        String value=null;
        Object o1=aClass.newInstance();
        Field[] fs=o1.getClass().getDeclaredFields();
        for (Field f: fs) {
            f.setAccessible(true);
            f.set(o1,jsonObject.getString(f.getName()));
        }
        list.add(o1);
    }

}
