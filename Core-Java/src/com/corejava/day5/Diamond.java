package com.corejava.day5;

public class Diamond implements B, C{

	@Override
	public void display(){
		B.super.display();
		C.super.display();
	}
	
	public static void main(String[] args){
		Diamond d = new Diamond();
		d.display();
	}
	
}
