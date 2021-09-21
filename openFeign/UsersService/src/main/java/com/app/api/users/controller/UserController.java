package com.app.api.users.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@GetMapping("/status")
	public String getStatus() {
		return "Active (User service)";
	}
	
	@GetMapping("/position")
	public String getPosition() {
		return "Italy (User service)";
	}
	
	@GetMapping("/number")
	public int getNumber() {
		return 5;
	}

}
