package com;

import java.awt.List;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		// TODO Auto-generated method stub
		Student s1= new Student(289,"abcd",999);
		Student s2= new Student(290,"efg",888);
		Student s3= new Student(291,"hij",777);
		Student s4= new Student(292,"klm",666);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		//try {
		FileOutputStream fos =new FileOutputStream("hello.txt");
		
		/*Object[] obj=new Object[]{s1,s2,s3,s4};
	        // Write object array to Stream Class
	        oos.writeObject(obj);
	        oos.close();*/
		ObjectOutputStream ous=new ObjectOutputStream(fos);
		ous.writeObject(s1);
		ous.writeObject(s2);
		ous.writeObject(s3);
		ous.writeObject(s4);
		ous.flush();
		ous.close();
		System.out.println("Written data to file...");
		
		/*}catch(FileNotFoundException e) {
			
			e.printStackTrace();
		}*/
		
		System.out.println("fetching data..");
	
		ArrayList<Student> studentList = new ArrayList<Student>();
		FileInputStream fis = null;
		ObjectInputStream in = null;
		try {
		    fis =new FileInputStream("hello.txt");
		    in = new ObjectInputStream(fis);
		    while (true) {
		       studentList.add((Student) in.readObject());
		     
		    }
		   
		} catch (EOFException eof) {
		    // Ignore. means you reached EOF
		}
		  System.out.println(studentList);
		
		    if (fis != null)
		        fis.close(); // close the stream
		    if(in != null)
		        in.close();
		
	}

}
