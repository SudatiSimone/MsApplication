package com.app.api.users.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.users.dto.UserDto;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Environment env;

	@GetMapping("/{userId}")
	public UserDto getStatus(@PathVariable Integer userId) throws RuntimeException {
		System.out.println("Miao");
		UserDto userdto = new UserDto();
		HttpStatus status;
		String message;
		if (userId == 1) {
			status= HttpStatus.OK;
			message= "Find user 1";
			userdto.setUserId(userId);
			userdto.setEmail("miao@miao.com");
			userdto.setName("simone");
			userdto.setPassword(1324);
			userdto.setSurname("dsgfsdhj");
			userdto.setTelephoneNumber(243533);
			userdto.setAssociatedPort(env.getProperty("local.server.port"));
		} else if (userId == 2) {
			status= HttpStatus.OK;
			message= "Find user 2";
			userdto.setUserId(userId);
			userdto.setEmail("miao2@miao2.com");
			userdto.setName("mario");
			userdto.setPassword(1324);
			userdto.setSurname("abba");
			userdto.setTelephoneNumber(111111);
			userdto.setAssociatedPort(env.getProperty("local.server.port"));
		} else {
			status= HttpStatus.NO_CONTENT;
			message= "User Not Found!!";
			throw new RuntimeException(message);
		}

		return userdto;

	}

}
