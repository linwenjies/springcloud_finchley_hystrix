package com.lwj.hystrix.configuration;

import javax.servlet.Servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

@Configuration
public class BeanConfiguration {

	/**
	 * 当前版本的spring cloud中没有默认的为断路器的监控页面增加访问路径，我们在这里手动的加一下
	 * 不加这个的话在application文件中配置也可以
	 * @return
	 */
	  @Bean public ServletRegistrationBean<Servlet> getServlet(){
	  
	  HystrixMetricsStreamServlet streamServlet = new
	  HystrixMetricsStreamServlet();
	  
	  ServletRegistrationBean<Servlet> registrationBean = new
	  ServletRegistrationBean<>(streamServlet);
	  
	  registrationBean.setLoadOnStartup(1);
	  
	  registrationBean.addUrlMappings("/actuator/hystrix.stream");
	  
	  registrationBean.setName("HystrixMetricsStreamServlet");
	  
	  
	  return registrationBean; }
	 
	
}
