package com.corejava.day5;

public interface B extends A{

	@Override
	public  default void display(){
		System.out.println("Display from B");
	}
	
}
