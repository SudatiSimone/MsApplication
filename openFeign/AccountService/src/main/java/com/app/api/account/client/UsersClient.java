package com.app.api.account.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.app.api.account.dto.UserDto;




//@FeignClient("USERS-WS")
@FeignClient(name = "${feign.name}", url = "${feign.url}")
public interface UsersClient {
	
	@GetMapping("/user/{userId}")
	public UserDto getStatus(@PathVariable ("userId") Integer userId);
	
	
}
