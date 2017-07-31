package com.tony.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.tony.models.MessageStore;

public class HelloWorldAction extends ActionSupport {
	private MessageStore messageStore;
	
	private String userName;
	
	private static int helloCount = 0;

	public String excute(){
		messageStore = new MessageStore();
		helloCount ++;
		return SUCCESS;
	}
	
	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getHelloCount() {
		return helloCount;
	}	
}
