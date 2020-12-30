package com;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOutputDemo {
	
	public static void main(String args[]) throws IOException{
	
	try {
	FileOutputStream fos=new FileOutputStream("abcd.txt" );
	fos.write(69);
	fos.close();
	System.out.println("File written successfully");

	}catch (FileNotFoundException e) {
		
		e.printStackTrace();
		
		
	}
	}  
}