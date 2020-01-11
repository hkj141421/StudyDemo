package com.study.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by forget on 2019/6/8.
 */
@Controller
public class TestController {

    @RequestMapping("/hello")
    public ModelAndView print()
    {
        ModelAndView model=new ModelAndView();
        model.setViewName("hello");
        return model;
    }

    @RequestMapping("/")
    public String first(HttpServletRequest request)
    {
        return "index";
    }

}
