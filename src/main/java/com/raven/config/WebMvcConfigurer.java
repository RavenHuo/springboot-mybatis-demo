package com.raven.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import com.raven.interceptor.FirstInterceptor;
import com.raven.interceptor.SecondInterceptor;


@Configuration

public class WebMvcConfigurer extends WebMvcConfigurationSupport{
	
	@Autowired
	FirstInterceptor firstInterceptor;
	
	@Autowired
	SecondInterceptor secondInterceptor;
	
	
	/**
    *
    * 功能描述:
    *  配置静态资源,避免静态资源请求被拦截
    * 
    */
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/static/**")
               .addResourceLocations("classpath:/static/");
       registry.addResourceHandler("/templates/**")
               .addResourceLocations("classpath:/templates/");
       super.addResourceHandlers(registry);
   }

	
	@Override
	protected void addInterceptors(InterceptorRegistry registry) {
		//设置拦截器及，拦截路径
		registry.addInterceptor(firstInterceptor).addPathPatterns("/*");
		registry.addInterceptor(secondInterceptor).addPathPatterns("/8");
		super.addInterceptors(registry);
	}
}
