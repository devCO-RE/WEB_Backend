package com.core.util.web;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.unit.DataSize;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	// @Bean
	// public MultipartConfigElement multipartConfigElement() {
	// 	MultipartConfigFactory factory = new MultipartConfigFactory();
	//
	// 	factory.setMaxFileSize(DataSize.ofBytes((1048576 * 100)));
	// 	factory.setMaxRequestSize(DataSize.ofBytes((1048576 * 100)));
	//
	// 	return factory.createMultipartConfig();
	// }
	//
	// @Bean
	// public MultipartResolver multipartResolver() {
	// 	return new CommonsMultipartResolver();
	// }

	@Bean
	public MultipartResolver multipartResolver()
	{
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
		multipartResolver.setMaxUploadSize(104857600); // 1024 * 1024 * 10 = 10 MB
		return multipartResolver;
	}


}