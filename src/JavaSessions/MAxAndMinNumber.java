package JavaSessions;
public class MAxAndMinNumber {
	public static void main(String[] args) {
		 int max=maximum(300,44,2);
		System.out.println(max);
	int min=minimum(60,58,89);
	System.out.println(min);
	}
	public static int maximum(int x,int y,int z)
	{
		if(x>y && x>z)
		{	
		System.out.println("X is the greatest");
		return x;
		}
		else if(y>z)
		{
		System.out.println("Y is the greatest");
		return y;
		}
		return 0;	
	}
	public static int minimum(int x,int y,int z)
	{
		if(x<y && x<z)
		{
			System.out.println("X is the smallest");
			return x;
		}
		else if(y<z)
		{
			System.out.println("Y is the smallest");
			return y;
		}
		return 0;	
	}
	
	
	
	
	

}
