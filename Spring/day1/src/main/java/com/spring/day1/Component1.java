package com.spring.day1;

import org.springframework.stereotype.Component;

@Component
public class Component1 {
	public String name = "Trainee ";
	public Component1() {
		System.out.println("Component1 is initialized");
	}
	public void showName() {
		System.out.println("My name is "+name);
	}
}
