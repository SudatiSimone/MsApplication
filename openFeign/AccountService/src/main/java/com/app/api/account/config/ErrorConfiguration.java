package com.app.api.account.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.api.account.error.CustomErrorDecoder;

import feign.codec.ErrorDecoder;

@Configuration
public class ErrorConfiguration {
	
	@Bean
	public ErrorDecoder errorDecoder() {
		return new CustomErrorDecoder();
	}

}
