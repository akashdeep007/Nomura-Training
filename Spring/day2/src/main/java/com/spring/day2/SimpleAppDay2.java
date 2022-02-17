package com.spring.day2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.day1.Message;
import com.spring.day1.SMSMessage;
import com.spring.day1.SpringConfig;
import com.spring.day1.TelegramMessage;

public class SimpleAppDay2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		String[] beanDefinitionNames = context.getBeanDefinitionNames();
		for (String bean : beanDefinitionNames) {
			System.out.println("bean names : "+bean);
		}
		
		Communicator bean = context.getBean("communicator",Communicator.class);
		bean.setOperator("Vodafone");
		System.out.println("bean : "+bean);
		
		Communicator bean2 = context.getBean(Communicator.class);
		System.out.println("bean2 "+bean2);
	
	}

}
