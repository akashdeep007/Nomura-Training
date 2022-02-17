package com.spring.day1;

import org.springframework.stereotype.Component;

@Component
public class TwitterMessage implements Message{
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public TwitterMessage() {
		System.out.println("Twitter initialized");
	}
	public String sendMessage() {
		System.out.println("Sending Twitter message :\n"+msg);
		return "";
	}
}
