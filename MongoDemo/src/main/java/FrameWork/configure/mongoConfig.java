package FrameWork.configure;

import FrameWork.Util.timeStampConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.core.convert.CustomConversions;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by forget on 2019/7/10.
 * mongodb配置类
 */
@Configuration
public class mongoConfig{
    @Bean
    public CustomConversions customConversions(){
        //添加自定义转换器
        List<Converter<?, ?>> converterList=new ArrayList<>();
        converterList.add(new timeStampConverter());
        return new CustomConversions(converterList);
    }
}
