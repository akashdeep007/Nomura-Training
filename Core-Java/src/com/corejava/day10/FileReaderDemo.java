package com.corejava.day10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static String path = "C:\\Users\\Raktim\\OneDrive\\Documents\\Training\\NRI-Fintech\\Lab\\";
	
	public static void main(String[] args){
		FileReader fr = null;
		BufferedReader br = null;
		try{
			File f = new File(path+"def.txt");
			fr = new FileReader(f);
			int i = fr.read();
			while(i != -1){
				System.out.print((char)i);
				i = fr.read();
			}
			
			fr.close();
			
			/*fr = new FileReader(new File(path+"def.txt"));
			
			char[] charArr = new char[(int)f.length()];
			
			fr.read(charArr);
			
			for(char c : charArr){
				System.out.print(c);
			}*/
			
			br = new BufferedReader(new FileReader(f));
			String data = br.readLine();
			while(data != null){
				System.out.println(data);
				data = br.readLine();
			}
			
			br.close();
			
		}catch(FileNotFoundException ex){
			ex.printStackTrace();
		}catch(IOException ex){
			ex.printStackTrace();
		}finally{
			if(fr != null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}
