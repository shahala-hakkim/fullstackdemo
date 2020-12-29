class OperatorDemo{

	public static void main(String args[]){
		
 	int a=20;
	int b=30,m=50;
	int c=a++, d=a--,e=++a,f=--a;
	System.out.println("a="+a);
	System.out.println("b"+b);
	System.out.println("m"+m);
	System.out.println("---Unary OPerator---");
	System.out.println("a++="+c);
	System.out.println("a--="+d);
	System.out.println("++a="+e);
	System.out.println("--a="+f);
	System.out.println("--Binary---");
        int sum=a+b;
	int diff=a-b;
	int prod=a*b;
	int quo=a/b;
	int rem=a%b;
	System.out.println("a+b"+sum);
	System.out.println("a-b"+diff);
	System.out.println("a*b"+prod);
	System.out.println("a/b"+quo);
	System.out.println("a%b"+rem);	
	if(a<25 && b>20)
	System.out.println("a<25 && b>20");
	if(a<25 || b>20)
	System.out.println("a<25 || b>20");
	 m+=a;

	System.out.println("m+="+m);
	
	System.out.println("a&b"+(a&b));
	
	System.out.println("a|b"+(a|b));
	System.out.println("left shift"+(a<<b));
	System.out.println("right shift"+(a>>b));
	
	

	
	
	
	
	
	
	
	
	
	
	
}

}