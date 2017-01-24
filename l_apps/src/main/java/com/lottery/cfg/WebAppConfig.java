package com.lottery.cfg;

import javax.servlet.MultipartConfigElement;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.boot.context.embedded.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@Configuration
@EnableWebMvc
@ComponentScan
public class WebAppConfig extends WebMvcAutoConfigurationAdapter {

	public void addInterceptor(InterceptorRegistry registry) {
		// registry.addInterceptor(new
		// UserSecurityInterceptor()).addPathPatterns("/user/**");
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations("/");
	}

	@Bean
	public MultipartConfigElement getMultipartResolver() {
		MultipartConfigFactory mc = new MultipartConfigFactory();
		mc.setMaxFileSize(100000000);
		return mc.createMultipartConfig();
	}
}
