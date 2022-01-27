package com.corejava.day4;

public class Human extends Animal {

	public void talk(){
		System.out.println("Hello World!!!");
	}
	
	@Override
	public void doEat(){
		System.out.println("Eat veg and non-veg food");
	}
	
	public int add(int a, int b, int c){
		return a+b+c;
	}

	@Override
	public String toString() {
		return "Human [noOfEyes=" + this.getNoOfEyes() + ", noOfEars=" + this.getNoOfEars() + ", noOfLegs=" + this.getNoOfLegs() + ", canSee="
				+ this.isCanSee() + ", eatingHabit=" + this.getEatingHabit() + "]";
	}
	
}
