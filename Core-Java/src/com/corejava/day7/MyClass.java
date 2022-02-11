package com.corejava.day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyClass {
	
	public String getName() throws IOException{
//		return "      raktim      ";
		
		// reading the name from a file
		return null;
	}
	
	public void calculate(int id) throws MyException{
		try{
			System.out.println("10/"+id+" is: "+10/id);
		}catch(ArithmeticException ex){
			throw new MyException("Err-001: Please use number other than 0");
		}
	}

	public static void main(String[] args) throws IOException{
		
		MyClass obj = new MyClass();
		
		String a = "     raktim";
		String b = obj.getName();
		String c = "raktim       ";
		
		// if a=b & b=c then print a = c
		
		try{
			if(b != null){
				if(a.trim().equals(b.trim()) && b.trim().equals(c.trim())){
					System.out.println("a = c");
				}else{
					System.out.println("a != c");
				}
			}		
			
			 File f = new File("");
			 f.getCanonicalPath();
			 
			 obj.calculate(0);
			 
			 System.out.println("Try block completed");
		}catch(FileNotFoundException e){
			System.out.println("Error occured during execution: "+e.getMessage());
		}catch(IOException e){
			
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}finally {
			System.out.println("finally block executed");
		}
		
		System.out.println("Everything is done");
		
	}
	
}
