package JavaSessions;

public class WithoutScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutScanner s = new WithoutScanner	();
		 int total =s.sum(2,3);
		 System.out.println(total);
			

	}
	
	public int sum(int a,int b)
	{
		System.out.println("Sum method");
		int c= a+b;
		return c;
		
	}

}
