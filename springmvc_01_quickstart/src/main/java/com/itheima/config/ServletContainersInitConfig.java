package com.itheima.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//4.定义一个servlet容器启动的配置类，在里面加载Spring的配置    （web容器配置类）
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    //加载springmvc容器配置   （加载springmvc配置类，产生springmvc容器（本质还是spring容器））
    protected WebApplicationContext createServletApplicationContext() {
        //设置哪些请求归属springmvc处理  （初始化WebApplicationContext对象）
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //加载指定配置类
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    //加载springmvc容器配置   （设置由springmvc控制器处理的请求映射路径）
    protected String[] getServletMappings() {
        return new String[]{"/"}; //所有请求归 springmvc处理
    }

    //加载spring配置类
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
