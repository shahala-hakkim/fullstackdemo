import java.util.*;

class EmployeeManagement {
	

		public static void main(String args[]){
		int employeeId=0;
		String employeeName="";
		String designation="";
		String option="";
		
			do{
					
			System.out.println("Enter  number 1 or 2");
		        Scanner sc=new Scanner(System.in);
		        int num=sc.nextInt();
			switch (num){
	
		
	
			case 1:{System.out.println("Enter  Employee ID");
		                 employeeId=sc.nextInt();
		                 System.out.println("Enter Employee name");
		 		employeeName=sc.next();
                 		System.out.println("Enter Designation");
				designation=sc.next();
				
				break;
			}
			case 2:{System.out.println("1.Employee Id:"+ employeeId);
			System.out.println("2.Employee name:"+ employeeName);	
			System.out.println("3.Designation:"+ designation);
				break;		
			}
			default:{System.out.println("Invalid entry. Press 1 or 2");
				break;}


}

System.out.println("Do you want to continue? Enter yes or no");
 option=sc.next();
}while(option.equalsIgnoreCase("yes"));

			

			
}
}

