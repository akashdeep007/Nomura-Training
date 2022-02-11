package com.corejava.day7;

public class MyException extends Exception {

	public MyException(){
		super();
	}
	
	public MyException(Throwable t){
		super(t);
	}
	
	public MyException(String msg){
		super(msg);
	}
	
	public MyException(String msg, Throwable t){
		super(msg, t);
	}
	
}
