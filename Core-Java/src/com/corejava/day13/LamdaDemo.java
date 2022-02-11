package com.corejava.day13;

public class LamdaDemo {
	
	public static void main(String[] args){
		// normal implementation of an Interface using a class
		I1 i1 = new A();
		i1.m1();
		i1.m2();
		
		// implementation of an Interface using annonymous inner class
		I1 i2 = new I1() {			
			@Override
			public void m1() {
				System.out.println("M1 called from annonymous inner class ");				
			}
		};
		
		i2.m1();
		
		// implementation of an Interface using lamda expression
		// to implement lamda function we have to define a FUNCTIONAL INTERFACE
		I1 i3 = () -> System.out.println("M1 method called");
		
		i3.m1();
		i3.m2();
		
		I1.m3();
	}
	
}

interface I1 {
	public void m1();
	
	default void m2(){
		System.out.println("M2 is a default method");
	}
	
	static void m3(){
		System.out.println("M3 is a static method");
	}
}

class A implements I1 {

	@Override
	public void m1() {
		System.out.println("M1 called from class A");
	}
	
	@Override
	public void m2() {
		System.out.println("M2 called from class A");
	}
	
}




