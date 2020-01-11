package FrameWork.Servlets;

import FrameWork.Service.MusicService;
import FrameWork.Service.UserService;
import FrameWork.ServiceImpl.MusicServiceImpl;
import FrameWork.bean.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.annotation.Resources;
import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Created by forget on 2019/6/5.
 */
public class HelloServlet extends BaseServlet{

    @Autowired
    public UserService userService;

    @Autowired
    public MusicService musicService;

    @Autowired
    public JdbcTemplate jdbcTemplate;


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String,Object> map=jdbcTemplate.queryForMap("select * from user limit 0,1");
        try {
            userService.getUser("jascasj","scsacaac");
        } catch (Exception e) {
            e.printStackTrace();
        }
        resp.getOutputStream().print(map.toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("获取属性filter"+req.getParameter("filter"));
    }

}
