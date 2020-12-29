abstract class Rbi{

	abstract void loan();
	
}

class Sbi extends Rbi{

	void loan(){

	System.out.println("Interest rate  in Sbi is 8%");

}}
class Icici extends Rbi{

	void loan(){

	System.out.println("Interest rate in Icici is 10%");

}}
class Canara extends Rbi{

	void loan(){

	System.out.println("Interest rate in canara is 12%");

}

}





class AbstractDemo{

	public static void main(String args[]){

	System.out.println("This is abstract demo");
	Sbi s= new Sbi();
	s.loan();
	Icici i = new Icici();
	i.loan();	
	Rbi c= new Canara();//RUN-TIME POLYMORPHISM	
	c.loan();	
}


}