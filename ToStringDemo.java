package com;

class A{
	
	int a;
	int b;
	int c=30;
	int d=30;
	@Override
	public String toString() {
		return "A [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", e=" + e + "]";
	}
	int e=30;
	public A(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("A value is:"+a);
		System.out.println("B value is:"+b);
		
		
	}	
	/*public display() {
		this.a=a;
		this.b=b;
		System.out.println("A value is:"+a);
		System.out.println("B value is:"+b);
		
	}	
*/	
	
}

public class ToStringDemo {

	public static void main(String[] args) {
		System.out.println("Hello");
		A a1=new A(20,50);
		//a1.display;
		System.out.println(a1);

	}

}
