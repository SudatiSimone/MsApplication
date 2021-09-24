package com.app.api.users.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.users.dto.UserDto;


@RestController
@RequestMapping("/user")
@Component
public class UserController {
	
	@Autowired
	Environment env;
	
	@Autowired
	private Map <Integer, UserDto> db;

	@GetMapping("/{userId}")
	public UserDto getStatus(@PathVariable Integer userId) throws RuntimeException {
		if (userId!=1){

			throw new RuntimeException("Non esiste questo utente");
		}
		UserDto userdto = db.get(userId);
		userdto.setAssociatedPort(env.getProperty("local.server.port"));
		return userdto;

	}

}
