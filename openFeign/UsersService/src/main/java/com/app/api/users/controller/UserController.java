package com.app.api.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.users.dto.UserDto;

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/{userId}")
	public UserDto getStatus(@PathVariable Integer userId) throws Exception {
		UserDto userdto = new UserDto();
		if (userId == 1) {
			userdto.setUserId(userId);
			userdto.setEmail("miao@miao.com");
			userdto.setName("simone");
			userdto.setPassword(1324);
			userdto.setSurname("dsgfsdhj");
			userdto.setTelephoneNumber(243533);
		} else if (userId == 2) {
			userdto.setUserId(userId);
			userdto.setEmail("miao2@miao2.com");
			userdto.setName("mario");
			userdto.setPassword(1324);
			userdto.setSurname("abba");
			userdto.setTelephoneNumber(111111);
		} else {
			throw new Exception ("utente non trovato");
		}

		return userdto;

	}

}
