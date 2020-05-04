package com.example.demo.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean AFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        AFilter aFilter=new AFilter();
        filterRegistrationBean.setFilter(aFilter);
        filterRegistrationBean.addUrlPatterns("*");
        filterRegistrationBean.setName("AFilter");
        filterRegistrationBean.setOrder(1);
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean BFilter() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        BFilter bFilter=new BFilter();
        filterRegistrationBean.setFilter(bFilter);
        filterRegistrationBean.addUrlPatterns("*");
        filterRegistrationBean.setName("BFilter");
        filterRegistrationBean.setOrder(2);
        return filterRegistrationBean;
    }
}
