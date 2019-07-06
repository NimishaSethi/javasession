package JavaSessions;
public class EvenOrOdd {
	public static void main(String[] args) {
		EvenOrOddNumber(45);
	}
	public static int  EvenOrOddNumber(int num)
	{
		if(num%2==0)
		{
		System.out.println(num+" "+"the number is even");	
		}
		else 
		{
		System.out.println(num+" "+"the number is odd");	
		}
		return num;
		
	}

}
