package com.corejava.day6;

public class StringTest {

	public static void main(String[] args){
		String str1 = "  raktim     ";
		char[] arr1 = {'r', 'a', 'k', 't', 'i', 'm'};
		
		String str3 = "Raktim Ghosh";
		
		System.out.println(str1);
		
		for(char c : arr1){
			System.out.print(c);
		}
		
		System.out.println("");
		
		String str2 = "RAKTIM";
		
		System.out.println("str1.equals(str2): "+str1.trim().equals(str2));
		
		System.out.println("str1.compareTo(str2): "+str1.trim().compareTo(str2));
		
		System.out.println("str1.charAt(2): "+str1.trim().charAt(2));
		
		System.out.println("str1.concat(str2): "+str1.trim().concat(str2));
		
		System.out.println("str1.contains(\"it\"): "+str1.trim().contains("it"));
		
		System.out.println("str1.endsWith(\"m\"): "+str1.trim().endsWith("m"));
		
		System.out.println("str1.startsWith(\"r\"): "+str1.trim().startsWith("r"));
		
		System.out.println("str1.replace('a', 'A'): "+str1.replace('a', 'A'));
		System.out.println("str1.replace('a', 'A'): "+str1.replace("akt", "AKT"));
		
		System.out.println("str1.trim(): "+str1.trim());
		
		System.out.println("str1.substring(3): "+str1.substring(3));
		
		System.out.println("str1.substring(3, 5): "+str1.substring(3, 5));
		
		
		
		System.out.println("str3.trim(): "+str3.trim());
		
		System.out.println("str1.toUpperCase(): "+str3.toUpperCase());
		
		System.out.println("str1.toLowerCase(): "+str3.toLowerCase());
		
		String[] strArr = str3.split(" ");
		
		for(String s : strArr){
			System.out.println(s);
		}
		
		String s = "name|phoneNo|email|address";
		
		String[] strArr1 = s.split("\\|", 4);
		
		for(String s1 : strArr1){
			System.out.println(s1);
		}
		
		StringBuffer sb = new StringBuffer();
		
		sb.append("My Name");
		sb.append(":");
		sb.append("Raktim Ghosh");
		sb.append(" ");
		sb.append(true);
		
		System.out.println(sb.toString());
		
		
	}
	
}
