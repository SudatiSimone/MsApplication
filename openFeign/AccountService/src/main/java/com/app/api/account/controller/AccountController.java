package com.app.api.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.account.client.UsersClient;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Autowired
	private UsersClient user_client;
	
	@GetMapping("/user-status")
	public String getUserStatus() {
		return user_client.getStatus();
	}
	
	@GetMapping("/user-position")
	public String getUserPosition() {
		return user_client.getPosition();
	}
	
	@GetMapping("/user-number")
	public String getUserNumber() {
		return user_client.getNumber();
	}

}
