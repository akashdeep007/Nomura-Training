package com.corejava.day4;

public class MyClass {

	public static void main(String[] args){
		/*Calculator c = new Calculator();		
		System.out.println("3 + 6 = "+c.add(3, 6));		
		System.out.println("3.2 + 6.75 = "+c.add(3.2, 6.75));*/
		
		Human h1 = new Human();
		Tiger t1 = new Tiger();
		
		h1.setCanSee(true);		
		h1.setNoOfEars(2);
		h1.setNoOfEyes(-1);
		h1.setNoOfLegs(2);
		h1.setEatingHabit("Veg & non-veg");
		
		System.out.println(h1.toString());
		System.out.println(t1.toString());
		
	}
	
}
