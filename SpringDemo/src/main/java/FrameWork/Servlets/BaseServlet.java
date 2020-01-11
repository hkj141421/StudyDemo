package FrameWork.Servlets;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

/**
 * Created by forget on 2019/6/8.
 */
public class BaseServlet extends HttpServlet{
    @Override
    public void init() throws ServletException {
        super.init();
        SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this,this.getServletContext());
    }
}
