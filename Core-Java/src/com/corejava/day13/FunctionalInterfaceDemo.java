package com.corejava.day13;

public class FunctionalInterfaceDemo {

	public static void main(String[] args){
		I2 iObj2 = (a, b) -> {
			System.out.println("a+b = "+(a+b));
			System.out.println("a-b = "+(a-b));
			};
		iObj2.add(10, 20);
		iObj2.add(1034, 200);
		
		I3 iObj3 = n -> {return n*n;};
		System.out.println(iObj3.square(10));
		System.out.println(iObj3.square(12));
		
		I4 iObj4 = new I4() {
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				
			}
		};
	}
	
}

@FunctionalInterface
interface I2{
	public void add(int a, int b);
}

@FunctionalInterface
interface I3{
	public int square(int n);
}

interface I4{
	public void m1();
	public void m2();	
}
