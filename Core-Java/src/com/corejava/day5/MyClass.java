package com.corejava.day5;

public class MyClass {

	public static void main(String[] args){
		/*Student s1 = new Student("Raktim Ghosh", "raktim@gmail.com","9674009360","IT","1");
		System.out.println(s1.toString());
		
		s1.setName("Ankan Bose");
		s1.setEmail("ankan@nri.com");
		s1.setRollNo("1001");
		System.out.println(s1.toString());
		
		System.out.println("Roll No is: "+s1.getRollNo());*/
		
		Human raktim = new Human();
		
		raktim.doBreath();
		raktim.doEat();
		raktim.doMove();
		
		Animal a = new Human();
		a.doBreath();
		a.doEat();
		a.doMove();
		a.doReproduce();
		
		Omnivorus ov = new Human();
		ov.eatFlesh();
		ov.eatPlant();
	}
	
}
