package JavaSessions;

import java.util.Scanner;
public class AdditionOftwoNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum();
		}
	 public static void Sum()
	{
		Scanner s = new Scanner(System.in);
		int x,y;
		System.out.println("Enter a number");
		x= s.nextInt();
		System.out.println("Enter another number");
		y= s.nextInt();
		System.out.println("sum is"+" "+(x+y));
	}
		
		
}


