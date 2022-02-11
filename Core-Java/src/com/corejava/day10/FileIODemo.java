package com.corejava.day10;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileIODemo {
	
	public static String path = "C:\\Users\\Raktim\\OneDrive\\Documents\\Training\\NRI-Fintech\\Lab\\";

	public static void main(String[] args){
		try{
			File f = new File(path+"abc.txt");
			
			System.out.println("File exists? "+f.exists());
			if(!f.exists())
				f.createNewFile();
			
			File dir = new File(path+"corejava");
			System.out.println("Dir exists? "+dir.exists());
			if(!dir.exists())
				dir.mkdir();
			
			File dir2 = new File(dir, "day10");
			if(!dir2.exists())
				dir2.mkdir();
			
			f = new File(dir, "abc.txt");
			f.createNewFile();
			
//			f.delete();
			
			System.out.println("Dir exists? "+dir.separator);
			
			System.out.println("File Length: "+f.length());
			
			System.out.println("Dir Length: "+Arrays.asList(dir.list()).toString());
			
			File testFile;
			
			String[] fileNameArr = dir.list();
			
			for(String fName : fileNameArr){
				testFile = new File(dir, fName);
//				System.out.println("testFile exists?: "+testFile.exists());
				if(testFile.isDirectory())
					System.out.println(fName+" is a folder");
				
				if(testFile.isFile())
					System.out.println(fName+" is a file");
			}
			
//			for(String name : )
			
		}catch(IOException ex){
			ex.printStackTrace();
		}
	}
	
}
