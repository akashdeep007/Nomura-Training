package com.spring.day2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.spring.day1.Message;
import com.spring.day1.TwitterMessage;

@Lazy(value = true)
@Component
public class Communicator {
	
	private String operator;

//	@Autowired
//	@Qualifier("SMSMessage")
	private Message message;
	
//	@Autowired
//	public void setMessage(@Qualifier("twitterMessage") Message message) {
//		System.out.println("Inside setter bbean injection");
//		((TwitterMessage)message).setMsg("Hi");
//		message.sendMessage();
//		this.message = message;
//	}
	
	@Autowired
	public Communicator(@Qualifier("twitterMessage") Message message) {
		this.message = message;
		System.out.println("Communicator Constructor called ");
	}
	
//	
//	@Autowired
//	private SMSMessage smsMessage  ;
	
//	@Autowired
//	private Message SMSMessage  ;
	
	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Override
	public String toString() {
		return "Communicator [operator=" + operator + ", message=" + message + "]";
	}

	
}
