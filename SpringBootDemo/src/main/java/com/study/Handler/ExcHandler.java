package com.study.Handler;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by forget on 2019/6/16.
 */
@Component
@Order(-100)
public class ExcHandler implements HandlerExceptionResolver{

//    @ExceptionHandler
//    public void handlerExcep(Exception e){
//        System.out.println("---------------- 出现异常 --------------");
//        System.out.println("异常信息为"+e.getMessage());
//    }

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("msg",e.getMessage());
        modelAndView.addObject("exc",e.getStackTrace());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}
