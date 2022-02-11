package com.corejava.day10;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static String path = "C:\\Users\\Raktim\\OneDrive\\Documents\\Training\\NRI-Fintech\\Lab\\";
	
	public static void main(String[] args){
			
		FileWriter fw = null;
		try {
			fw = new FileWriter(new File(path+"def.txt"), false);
			fw.write(100);
			fw.write('\n');
			fw.write('A');
			fw.write('\n');
			char[] arr = {'B', 'V', 'E'};
			fw.write(arr);
			fw.write('\n');
			fw.write("This is my first file");
			fw.write('\n');
			
			fw.write("After flush");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try{
				if(fw != null){
					fw.flush();
					fw.close();
				}
			}catch(IOException ex){
				ex.printStackTrace();
			}
		}
		
		
	}
	
}
