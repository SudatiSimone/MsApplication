package com.app.api.account.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="userClient", url="http://blu26804.replynet.prv:8090/users")
public interface UsersClient {
	
	@GetMapping("/status")
	String getStatus();
	
	@GetMapping("/position")
	String getPosition();
	
	@GetMapping("/number")
	String getNumber();
	
	
}
