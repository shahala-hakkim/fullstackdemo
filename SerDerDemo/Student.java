package com;

import java.io.Serializable;

public class Student implements Serializable{
	int marks;
	String name;
	int mobileNo;
	
	Student(int x,String y,int z){
		marks=x;
		name=y;
		mobileNo=z;
		
		
		
		
	}

	@Override
	public String toString() {
		return "Student [marks=" + marks + ", name=" + name + ", mobileNo=" + mobileNo + "]";
	}
}
