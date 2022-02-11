package com.corejava.day11;

public class ThreadDemo extends Thread{

	@Override
	public void run(){
		System.out.println("Thread 1");
	}
	
	public static void main(String[] agrs){		
		ThreadDemo obj = new ThreadDemo();		
		obj.run();
		
		System.out.println("Tread count before start: "+obj.activeCount());		
		obj.start();
		
		System.out.println("Tread count after start: "+obj.activeCount());
	}
	
}
