package com.app.api.account.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserDto {
	
	@NotNull
	private String name;
	private String surname;
	private int telephoneNumber;
	@Email
	private String email;
	@NotBlank
	private int password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getTelephoneNumber() {
		return telephoneNumber;
	}
	public void setTelephoneNumber(int telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	public UserDto(@NotNull String name, String surname, int telephoneNumber, @Email String email,
			@NotBlank int password) {
		super();
		this.name = name;
		this.surname = surname;
		this.telephoneNumber = telephoneNumber;
		this.email = email;
		this.password = password;
	}
	
	public UserDto() {
		// TODO Auto-generated constructor stub
	}
	
}
