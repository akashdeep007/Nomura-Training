package com.spring.day1;

import org.springframework.stereotype.Component;

@Component
public class SMSMessage implements Message{
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public SMSMessage() {
		System.out.println("SMS initialized");
	}
	public String sendMessage() {
		System.out.println("Sending SMS message :\n"+msg);
		return "";
	}
}
