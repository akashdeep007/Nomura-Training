package com.spring.day1;

import org.springframework.stereotype.Component;

@Component
public class SMSMesage implements Message{
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public SMSMesage() {
		System.out.println("SMS initialized");
	}
	public void sendMessage() {
		System.out.println("Sending SMS message :\n"+msg);
	}
}
