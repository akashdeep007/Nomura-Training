package com.corejava.day6;

public class ArrayTest {

	public static void main(String[] args){
		int[] intArr1 = {1, 2, 3, 4, 5, 6};
		char[] charArr = new char[6];
		
		int[] intArr2 = intArr1;
		
		for(int i: intArr2){
			System.out.print(i);
		}
		
		System.out.println("______________");
		
		intArr1[3] = 9;
		
		charArr[0] = 'r';
		charArr[1] = 'a';
		charArr[2] = 'k';
		charArr[3] = 't';
		charArr[4] = 'i';
		charArr[5] = 'm';

		for(int i = 0; i< charArr.length; i++){
			System.out.print(charArr[i]);
		}
		System.out.println("______________");
		for(int i: intArr1){
			System.out.println(i);
		}
		
		
		
	}
	
}
