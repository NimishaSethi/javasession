package JavaSessions;

import java.util.Scanner;

public class ConditionalOperators {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter all Four intergers");
	int a= sc.nextInt();
	System.out.println("Enter all Four intergers");
	System.out.println("You Entered Integer"+ " "+a );
	int b= sc.nextInt();
	System.out.println("You Entered Integer"+" "+ b );	
	int c= sc.nextInt();
	System.out.println("You Entered Integer"+ " "+c );
	int d= sc.nextInt();
	System.out.println("You Entered Integer"+" "+ d);
	if (a>b &&a >c && a> d)
	{
	 System.out.println("a is greatest"+ " " +a);	
	}else if (b>c &&b >d )
	{
	System.out.println("b is greatest"+" "+ b);
	}
	else if (c>d )
	{
	System.out.println("c is greatest"+" " +c);		
	}
	else
	{	
	System.out.println("d is  the greatest"+" "+ d);			
	}
	}
}
	

