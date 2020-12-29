interface Abc{
	int a=8;
	void method1();
	public default void  display(){

		System.out.println("It is possible to write methods in interface using default keyword in Java 8");
		}
	static void display2(){
	System.out.println("It is possible to write methods in interface using static keyword in Java 8");
	}



}
interface Abc2 {

void print();


}


class Xyz implements Abc, Abc2{

	public void method1(){


	System.out.println("This is void method1");}



	
           public void print(){

 		System.out.println("Multiple inheritance is accomplished with the help of interfaces");
	
}




}



class InterfaceDemo{

	public static void main(String args[]){
	Xyz s= new Xyz();
	s.method1();
	s.display();
	Abc.display2();
	s.print();




}



}