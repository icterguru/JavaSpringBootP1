package com.icterguru.entity;

import org.springframework.http.HttpStatus;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor

public class ErrorMessage {
	
	private HttpStatus status;
	private String message;
	

	public ErrorMessage(HttpStatus notFound, String message2) {
		// TODO Auto-generated constructor stub
		this.status = notFound;
		this.message = message2;
	}
	

	

}
