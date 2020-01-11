package FrameWork.Controller;

import FrameWork.Dao.UserMapper;
import FrameWork.Jmx.Monitor;
import FrameWork.Service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;
import java.util.Set;

/**
 * Created by forget on 2019/6/13.
 */
@Controller
@Api(tags = "测试")
public class TestController {

    @Autowired
    UserService userService;

    Monitor monitor=new Monitor();

    @GetMapping("/user")
    @ApiOperation(value = "测试框架接口",httpMethod = "any")
    public ModelAndView testSSM(HttpServletRequest request){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("hello");
        modelAndView.addObject("list",userService.SelectAllUser(request.getParameter("name")));
        return modelAndView;
    }

    @GetMapping("/")
    @ApiOperation("测试接口")
    @ResponseBody
    public Map<String,Object> firat(){
        Map<String,Object> reqinfo=monitor.getRequestInfo();
        return reqinfo;
    }

    @GetMapping("/threadpool")
    @ApiOperation("测试接口")
    @ResponseBody
    public Map<String,Object> threadpool(){
        Map<String,Object> reqinfo=monitor.getThreadInfo();
        return reqinfo;
    }

}
