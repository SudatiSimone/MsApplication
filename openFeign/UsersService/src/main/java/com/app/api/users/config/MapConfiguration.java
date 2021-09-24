package com.app.api.users.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.app.api.users.dto.UserDto;

@Configuration
public class MapConfiguration {
	
	@Autowired
	Environment env;
	
	@Bean
	public Map <Integer, UserDto> db(){
		Map<Integer, UserDto> res = new HashMap<Integer,UserDto>();
		UserDto userdto = new UserDto();
		userdto.setUserId(1);
		userdto.setEmail("miao@miao.com");
		userdto.setName("simone");
		userdto.setPassword(1324);
		userdto.setSurname("dsgfsdhj");
		userdto.setTelephoneNumber(243533);
		userdto.setAssociatedPort(env.getProperty("local.server.port"));
		res.put(1, userdto);
		return res;
		
	}

}
