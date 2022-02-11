package com.corejava.day10;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static String path = "C:\\Users\\Raktim\\OneDrive\\Documents\\Training\\NRI-Fintech\\Lab\\";
	
	public static void main(String[] args){
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(new File(path+"def.txt"), true));
			
			bw.write(new Integer(100));
			bw.newLine();
			bw.write('A');
			bw.newLine();
			char[] arr = {'B', 'V', 'E'};
			bw.write(arr);
			bw.newLine();
			bw.write("This is my first file");
			bw.newLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				if(bw != null){
					bw.flush();
					bw.close();
				}
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
	}
	
}
