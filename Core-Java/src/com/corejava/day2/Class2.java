package com.corejava.day2;

public class Class2 {

	public static void main(String[] args){
		MyClass obj1 = new MyClass();
		MyClass obj2 = new MyClass();
		
		obj1 = new MyClass();
		
		MyClass.Student s = new MyClass.Student();
		
		Singleton s1 = Singleton.getInstance();
		s1.doAction();
		
		/*MyClass obj3 = new MyClass();		
		MyClass obj4 = new MyClass();
		MyClass obj5 = new MyClass();*/
		
		/*obj1.updateMarks(70);
		obj2.updateMarks(76);
		obj3.updateMarks(72);
		obj4.updateMarks(80);
		obj5.updateMarks(60);
		
		obj1.printDetails();
		obj2.printDetails();
		obj3.printDetails();
		obj4.printDetails();
		obj5.printDetails();*/
		
/*		System.out.println(MyClass.sum(1,  2));
		System.out.println(MyClass.sum(10,  20));
		System.out.println(MyClass.sum(15,  27));*/
	}
	
}
