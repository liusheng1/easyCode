package com.example.demo.filter;

import javax.servlet.*;
import java.io.IOException;

public class AFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filterA----------");
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
