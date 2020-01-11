package com.study.Config;

import com.study.Interceptors.ExtendInterceptor;
import com.study.Interceptors.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by forget on 2019/6/9.
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "com.study.Controller")
public class SpringMVCConfig implements WebMvcConfigurer{

//    @bean
//    public InternalResourceViewResolver internalResourceViewResolver(){
////        配置视图解析器
//        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
//        internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
//        internalResourceViewResolver.setSuffix(".jsp");
//        return internalResourceViewResolver;
//    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry){
//        将本地文件路径映射为资源路径
        registry.addResourceHandler("/static/**").addResourceLocations("file:E:/ItemStatic/static/");
        registry.addResourceHandler("/upload/**").addResourceLocations("file:E:/ItemStatic/upload/");
    }

    @Override
    public void configureViewResolvers(ViewResolverRegistry registry){
        InternalResourceViewResolver internalResourceViewResolver=new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/jsp/");
        internalResourceViewResolver.setSuffix(".jsp");
        registry.viewResolver(internalResourceViewResolver);
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
//        不拦截静态资源
        configurer.enable();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry){
//        注册拦截器
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/").excludePathPatterns("/static/**","/upload/**");
    }
}
