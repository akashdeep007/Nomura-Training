package com.corejava.day12;

public class Main {

	public static void main(String[] args){
		
		Topic topic1 = new Topic("This is for test");
		
		Subscriber sub1 = new Subscriber(topic1);
		Thread t1 = new Thread(sub1, "subscriber 1");
		t1.start();
		Subscriber sub2 = new Subscriber(topic1);
		Thread t2 = new Thread(sub2, "subscriber 2");
		t2.start();
		Subscriber sub3 = new Subscriber(topic1);
		Thread t3 = new Thread(sub3, "subscriber 3");
		t3.start();
		
		String messgae = "Hey there!!!";
		Publisher pub = new Publisher(topic1, messgae);		
		Thread t4 = new Thread(pub, "Publisher");
		t4.start();
		
		System.out.println("Main thread");
	}
	
}
