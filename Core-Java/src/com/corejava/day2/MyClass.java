package com.corejava.day2;

public class MyClass {

	public String name;
	public int rollNo;
	public String emailId;
	public int marks;
	public static int highestNumber;
	public static int count;
	
	public int id = 0;
	private int id1;
	protected int id2;
	int id3;
	
	int a;
	
	{
		System.out.println("Init block invoked");
	}
	
	static{
		System.out.println("Static block invoked");
	}
	
	public MyClass(){		
		System.out.println("Constructor invoked");
	}
	
	public MyClass(String name){
		this.name = name;
	}
	
	public MyClass(String name, int rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
	
	public MyClass(int rollNo, String email){
		this.rollNo = rollNo;
		this.emailId = email;
	}
	
	public MyClass doSomething(){
		this.name = "";
		this.emailId = "";
		
		
		return this;
	}
	
	public void printDetails(){
		
		String localName = this.name;
		if(this.name == null)
			localName = "No Name Defined";
		
		
		int localRollNo = this.rollNo;
		
		count = 0;
		
		if(this.rollNo == 0)
			localRollNo = -1;
		System.out.println("ID is :"+this.id);
//		System.out.println("Welcome to MyClass. The object Name is: "+localName+" with roll no: "+localRollNo+" with emailId: "+emailId);
		System.out.println("Marks achived: "+this.marks+" and heighest marks is: "+highestNumber);
		System.out.println("______________________________________________________________");
	}
	
	public void doSleep(){
		System.out.println("Zzzzzz......");
	}
	
	public void printHeighest(){
		System.out.println("Highest Number is: "+highestNumber);
	}
	
	public void updateMarks(int marks){
		this.marks = marks;
		
		if(this.marks > highestNumber)
			highestNumber = this.marks;
	}
	
	public static int sum(int a, int b){
		return a+b;
	}
	
	static class Student{
		public int id;
		public String name;
	}
			
}
