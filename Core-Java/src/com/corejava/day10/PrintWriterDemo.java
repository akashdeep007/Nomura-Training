package com.corejava.day10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static String path = "C:\\Users\\Raktim\\OneDrive\\Documents\\Training\\NRI-Fintech\\Lab\\";
	
	public static void main(String[] args){
		
		try {
			PrintWriter pw = new PrintWriter(new FileWriter(new File(path+"def.txt"), true), true);
			pw.write("Write using print writer autoFlash");
			pw.println();
			pw.println(100);
			pw.close();
			System.out.println(1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
