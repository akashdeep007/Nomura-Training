package com.corejava.day2;

public class Singleton {

	private static Singleton _singleton;
	
	private Singleton(){
		// restricting to create object from outside
	}
	
	public static Singleton getInstance(){
		if(_singleton == null)
			_singleton = new Singleton();
		
		return _singleton;
	}
	
	public void doAction(){
		System.out.println("Singleton Implementation");
	}
	
}
