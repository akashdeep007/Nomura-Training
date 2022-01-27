package com.corejava.day5;

public interface C extends A{

	@Override
	public  default void display(){
		System.out.println("Display from C");
	}
	
}
