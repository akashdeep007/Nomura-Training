package com.spring.day1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleApp {

	public static void main(String[] args) {
		System.out.println("First project");
	   // Spring way of Java object usage
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Component1 bean = context.getBean(Component1.class);
		bean.showName();
		
		Message smsMsg = context.getBean("SMSMessage",SMSMessage.class);
		((SMSMessage)smsMsg).setMsg("SMS 1");
		smsMsg.sendMessage();
		
		Message teleGrammMMessage = context.getBean(TelegramMessage.class);
		((TelegramMessage)teleGrammMMessage).setMsg("telegram nmsg");
		teleGrammMMessage.sendMessage();
		
		Message twitterMessage = context.getBean(TwitterMessage.class);
		((TwitterMessage)twitterMessage).setMsg("tweet tweet");
		twitterMessage.sendMessage();
		
	}

}

