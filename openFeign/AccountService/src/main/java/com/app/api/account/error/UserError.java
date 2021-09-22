package com.app.api.account.error;

public class UserError extends RuntimeException {
	private String message;
	private Integer id;
	private Integer numberExcp;

	public UserError() {
		super();
		message = "Content not found";
		id = 234;
		numberExcp = 500;
		// TODO Auto-generated constructor stub
	}

	public UserError(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UserError(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UserError(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UserError(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
