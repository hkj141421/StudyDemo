package FrameWork.Filters;


import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by forget on 2019/6/5.
 */
public class requestFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("正在过滤"+httpServletRequest.getServletContext().getContextPath()+"请求");
        httpServletRequest.setAttribute("filter","已过滤");
        filterChain.doFilter(httpServletRequest,httpServletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("requestFilter过滤器已销毁");
    }
}
