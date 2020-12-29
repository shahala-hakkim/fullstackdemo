final class A{//------------------------------------->Can't be inherited
	final int a=10;//------------------------------->Can't be changed
	public final void display(){//------------------>Can't be overriden

	System.out.println("a="+a);
}

}



class Final{
	public static void main(String args[]){
		A a1= new A();
		System.out.println(a1.a);
		a1.display();



}


}