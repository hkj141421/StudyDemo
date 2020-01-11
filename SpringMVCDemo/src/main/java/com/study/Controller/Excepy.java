package com.study.Controller;

import com.sun.xml.internal.ws.handler.HandlerException;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.AbstractHandlerExceptionResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by forget on 2019/6/9.
 */
@Order(-1000)
public class Excepy implements HandlerExceptionResolver{

//    @ExceptionHandler
//    @ResponseBody
//    public ModelAndView Error(Exception e)
//    {
//        ModelAndView modelAndView=new ModelAndView();
//        modelAndView.setViewName("error");
//        modelAndView.addObject("errMsg",e.getMessage());
//        return modelAndView;
//    }

    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("error");
        modelAndView.addObject("errMsg",e.getMessage());
        return modelAndView;
    }
}
