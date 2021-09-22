package com.app.api.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.account.client.UsersClient;
import com.app.api.account.dto.UserDto;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private UsersClient userClient;
	
	@GetMapping("/userstatus/{userId}")
	public UserDto getUserStatus(@PathVariable Integer userId) {
		System.out.println("bau");
		return userClient.getStatus(userId);
	}
	


}
