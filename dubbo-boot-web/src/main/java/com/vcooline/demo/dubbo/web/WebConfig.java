package com.vcooline.demo.dubbo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextListener;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan("com.vcooline.demo.dubbo.web")
public class WebConfig extends WebMvcConfigurerAdapter {

	@Value("${characterEncoding}")
	private String characterEncoding;

	@Bean
	public DispatcherServlet dispatcherServlet() {
		return new DispatcherServlet();
	}

	@Bean
	public FilterRegistrationBean characterEncodingFilter() {
		CharacterEncodingFilter filter = new CharacterEncodingFilter();
		filter.setEncoding(characterEncoding);
		filter.setForceEncoding(true);

		FilterRegistrationBean bean = new FilterRegistrationBean();
		bean.setFilter(filter);
		bean.addUrlPatterns("/*");
		return bean;
	}

	@Bean
	public RequestContextListener requestContextListener() {
		return new RequestContextListener();
	}
}
