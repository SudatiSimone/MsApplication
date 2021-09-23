package com.app.api.account.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.core.env.Environment;

import lombok.Data;

@Data
public class UserDto {
	
	@NotNull
	private String name;
	private String surname;
	private int telephoneNumber;
	@Email
	private String email;
	@NotBlank
	private int password;
	private String associatedPort;
	
	
}
