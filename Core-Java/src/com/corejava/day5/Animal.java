package com.corejava.day5;

public abstract class Animal {

	public abstract void doEat();
	
	public abstract void doMove();
	
	public void doBreath(){
		System.out.println("Take oxygen in and C02 out ");
	}
	
	public abstract void doReproduce();
	
}
