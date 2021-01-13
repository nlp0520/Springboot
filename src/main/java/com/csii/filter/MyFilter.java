package com.csii.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Auther:niulipeng
 * @Date:2021/1/12
 * @Description:com.csii.filter
 * @Version:1.0
 */
@WebFilter(filterName = "myFilter",urlPatterns = "/filter")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void destroy() {
        System.out.println("destroy");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
