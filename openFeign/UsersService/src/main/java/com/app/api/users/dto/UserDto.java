package com.app.api.users.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data 
public class UserDto {
	
	@NotNull
	private String name;
	private String surname;
	private Integer telephoneNumber;
	@Email
	private String email;
	@NotBlank
	private Integer password;
	private Integer userId;
	
	
}
