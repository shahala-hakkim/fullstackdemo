class Abc{
	int x,y;
	Abc(){  this(20,50);
		System.out.println("This is default constructor");
		}

	Abc(int x,int y){
			this.x=x;
			this.y=y;
			System.out.println("This is parameterized constructor");
			
			
		}

         public void display1(){
	this.display2();
	System.out.println("x="+x +"  y="+y);

		}

	public void display2(){
		System.out.println("display2");

		}
} 

class ConstructorDemo{
	public static void main(String args[]){
	Abc a1=new Abc();
	a1.display1();
	

	}

}