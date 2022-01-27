package com.corejava.day4;

public class Animal {

	private int noOfEyes;
	private int noOfEars;
	private int noOfLegs;
	private boolean canSee;
	private String eatingHabit;
	
	public void doEat(){
		System.out.println("Ear from Animal");
	}
	
	public void doMove(){
		System.out.println("Move as Animal");
	}
	
	public int add(int a, int b){
		return a+b;
	}

	public int getNoOfEyes() {
		return noOfEyes;
	}

	public void setNoOfEyes(int noOfEyes) {
		if(noOfEyes < 0)
			this.noOfEyes = 0;
		else
			this.noOfEyes = noOfEyes;
	}

	public int getNoOfEars() {
		return noOfEars;
	}

	public void setNoOfEars(int noOfEars) {
		this.noOfEars = noOfEars;
	}

	public int getNoOfLegs() {
		return noOfLegs;
	}

	public void setNoOfLegs(int noOfLegs) {
		this.noOfLegs = noOfLegs;
	}

	public boolean isCanSee() {
		return canSee;
	}

	public void setCanSee(boolean canSee) {
		this.canSee = canSee;
	}

	public String getEatingHabit() {
		if(this.eatingHabit == null)
			return "unknown";
		return eatingHabit;
	}

	public void setEatingHabit(String eatingHabit) {
		this.eatingHabit = eatingHabit;
	}
	
	
	
}
