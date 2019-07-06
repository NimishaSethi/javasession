package JavaSessions;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner (System.in);
 System.out.println("Enter the  integer to check");
	int number= sc.nextInt();
	 System.out.println(" Entered  number  is "+ " " +number);
	 if (number>0)
	 {
	System.out.println(number+" "  +"is a positive integer" );
	 }
	 else if (number<0)
	 {	
 System.out.println(number+" "  +"is a negative integer" );
		 
	 }
	 
		 
		 
	 
}
}
