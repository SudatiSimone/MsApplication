package com.app.api.account.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.app.api.account.dto.UserDto;


@FeignClient("USERS-WS")
public interface UsersClient {
	
	@GetMapping("/users/status")
	public UserDto getStatus();
	
	
}
