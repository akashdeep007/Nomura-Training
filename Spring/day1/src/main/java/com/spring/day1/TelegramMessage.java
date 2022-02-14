package com.spring.day1;

import org.springframework.stereotype.Component;

@Component
public class TelegramMessage implements Message{
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public TelegramMessage() {
		System.out.println("telegram initialized");
	}
	public void sendMessage() {
		System.out.println("Sending Telegram message :\n"+msg);
	}
}
