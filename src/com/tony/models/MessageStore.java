package com.tony.models;

public class MessageStore {
	private String message;
	
	public MessageStore(){
		message = "Hello Struts usrer, greeting from tony";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
