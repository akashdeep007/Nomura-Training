package com.corejava.day10;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class ByteStreamsDemo {

	public static String path = "C:\\Users\\Raktim\\OneDrive\\Documents\\Training\\NRI-Fintech\\Lab\\";
	
	public static void main(String[] args){
	
		try {
			/*InputStreamReader isr = new InputStreamReader(new FileInputStream(new File(path+"JVM.jpg")));
								
			int i = isr.read();
			while(i != -1){
				System.out.print((char)i);
				i = isr.read();
			}
			
			isr.close();*/
			
			File existingFile = new File(path+"pexels-david-besh-884788.jpg");
			
			System.out.println("File Size: "+existingFile.length());

			InputStream is = new FileInputStream(existingFile);
			
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			
			byte[] b = new byte[1024];
			
			int i;
			
			while((i = is.read(b, 0, b.length)) != -1){
//				System.out.println("read data size"+i);
				baos.write(b);
			}
			
			OutputStream os = new FileOutputStream(path+"NEWFILE.jpg");
			os.write(baos.toByteArray());
			
			os.flush();
			baos.close();
			os.close();
			
			
			
			is.close();
//			os.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
