package com.zccoder.cloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @title 启动类
 * @describe 使用Zuul上传文件
 * @author zc
 * @version 1.0 2017-12-11
 */
@SpringBootApplication
@EnableEurekaClient
public class ZuulStart extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ZuulStart.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ZuulStart.class);
	}
}