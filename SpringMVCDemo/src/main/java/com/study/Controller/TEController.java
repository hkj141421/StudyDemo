package com.study.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by forget on 2019/6/9.
 */
@Controller
public class TEController {
    @GetMapping("/kkk")
    public void test()
    {
        int i=5/0;
    }

    @GetMapping("/red")
    public void test01(HttpServletRequest request, HttpServletResponse response) throws IOException {
//        return "redirect:/WEB-INF/jsp/index.jsp";
        response.sendRedirect("hello.jsp");
    }

    @GetMapping("for")
    public String test00(){
        return "forward:hello";
    }
    @GetMapping("redMode")
    public ModelAndView test03(RedirectAttributes redirectAttributes){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("redirect:/hello");
        redirectAttributes.addAttribute("key","231321");
        redirectAttributes.addFlashAttribute("key2","543231");
        return modelAndView;
    }

    @GetMapping("forMode")
    public ModelAndView test04(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("forward:/hello");
        return modelAndView;
    }

    @GetMapping("index")
    public void red()
    {
        System.out.println("重定向");
    }
}
