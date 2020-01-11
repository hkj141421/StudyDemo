package FrameWork.Util;

import org.springframework.core.convert.converter.Converter;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by forget on 2019/7/10.
 * 将数据库中的Date数据转为TimeStamp数据
 */
public class timeStampConverter implements Converter<Date,Timestamp>{
    @Override
    public Timestamp convert(Date o) {
        if (o!=null)return new Timestamp(o.getTime());
        return null;
    }
}
