package com.corejava.day5;

public class Human extends Animal implements Omnivorus{

	@Override
	public void doEat(){
		System.out.println("Eat veg & non-veg food");
	}
	
	@Override
	public void doMove(){
		System.out.println("Move with the help of 2 legs");
	}
	
	@Override
	public void doReproduce(){
		System.out.println("Give birth to the young ones");
	}
	
	@Override
	public void eatPlant(){
		System.out.println("Eat raw or cooked fruits and vegetables");
	}
	
	@Override
	public void eatFlesh(){
		System.out.println("Eat raw or cooked flesh");
	}
	
	public void doCommunicate(){
		System.out.println("Can talk to each other");
	}
	
}
