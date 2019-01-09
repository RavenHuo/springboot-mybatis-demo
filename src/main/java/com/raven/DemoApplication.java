package com.raven;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.raven.interceptor.FirstInterceptor;
import com.raven.interceptor.SecondInterceptor;

/**
 * @author rawen
 * 配置redis缓存，允许缓存
 *@EnableScheduling
  @EnableCaching
 */
@SpringBootApplication
@MapperScan("com.raven.mapper")
/*@EnableScheduling
@EnableCaching*/
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
}
