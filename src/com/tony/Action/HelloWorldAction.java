package com.tony.Action;

import com.opensymphony.xwork2.ActionSupport;
import com.tony.models.MessageStore;

public class HelloWorldAction extends ActionSupport {
	private MessageStore messageStore;

	public String excute(){
		messageStore = new MessageStore();
		return SUCCESS;
	}
	
	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}
}
