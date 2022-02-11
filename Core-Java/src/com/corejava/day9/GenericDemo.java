package com.corejava.day9;

import java.util.ArrayList;
import java.util.List;

import com.corejava.day4.Animal;
import com.corejava.day4.Human;
import com.corejava.day4.Tiger;
import com.corejava.day5.Student;

public class GenericDemo<T> {
	
	public void sum(List<? extends Number> l){
		System.out.println("do the sum");
	}
	
	public String m2(T t){
		System.out.println("New method with String return type. ");
		return null;
	}
	
	public static void main(String[] args){
		/*GenericDemo<Integer> obj1 = new GenericDemo<Integer>();
		
		GenericDemo<Double> obj2 = new GenericDemo<Double>();
		
		GenericDemo<Long> obj3 = new GenericDemo<Long>();
		
		GenericDemo<String> obj4 = new GenericDemo<String>();*/
		
		GenericDemo<Tiger> t = new GenericDemo<Tiger>();
		
		GenericDemo<Human> h = new GenericDemo<Human>();
		
		GenericDemo<Student> s = new GenericDemo<Student>();
		
	}
	
}
