package com.fxy.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.servlet.Filter;


public class ServletContainerInitContext extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{springConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{springmvcConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    //设置中文乱码问题
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }
}

//定义一个servlet容器启动的配置类，在里面加载spring的配置
//public class ServletContainerInitContext extends AbstractDispatcherServletInitializer {
//    //加载spingmvc容器配置
//    @Override
//    protected WebApplicationContext createServletApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(springmvcConfig.class);
//        return ctx;
//    }
//    //设置哪些请求归属于springmvc处理
//    @Override
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//    //加载spring容器配置
//    @Override
//    protected WebApplicationContext createRootApplicationContext() {
//        return null;
//    }
//}
