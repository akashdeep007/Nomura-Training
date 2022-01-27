package com.corejava.day4;

public class Tiger extends Animal {

	public void roar(){
		System.out.println("Haaluuuummmm.....");
	}
	
	@Override
	public void doEat(){
		System.out.println("Eat raw flesh");
	}

	@Override
	public String toString() {
		return "Tiger [noOfEyes=" + this.getNoOfEyes() + ", noOfEars=" + this.getNoOfEars() + ", noOfLegs=" + this.getNoOfLegs() + ", canSee="
				+ this.isCanSee() + ", eatingHabit=" + this.getEatingHabit() + "]";
	}
}
