
import java.util.Scanner; 
class MarkEvaluation{

	public static void main(String args[]){
	Scanner scan = new Scanner(System.in); 
	System.out.println("Enter your marks");
	int marks=scan.nextInt();

	if(marks<45)
	{System.out.println("Grade:F");}
	
	else if(marks>45 && marks<=50)
	{System.out.println("Grade:C");}


	else if(marks>55 && marks<=60)
	{System.out.println("Grade:B");}

	else if(marks>60 && marks<=70)
	{System.out.println("Grade:B+");}

	else if(marks>70 && marks<=80)
	{System.out.println("Grade:A");}


	else if(marks>80 && marks<=90)
	{System.out.println("Grade:A+");}

	else if(marks>90 && marks<=100)
	{System.out.println("Grade:O");}	

}


}