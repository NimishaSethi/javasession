package JavaSessions;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 10;
		int b = 30;
		double c =12.33;
		double d= 12.34;
		String x ="hello";
		String y= "Selenium";
		System.out.println(a+b);
		System.out.println(x+y);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		//left to right execution
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+a+b+y+(a+b)); //left to right execution
		System.out.println(x+y+c+d);
		System.out.println(a+b+c+d);
		System.out.println(x+y+c+d+a+b);
		//it will merge but not perform addition operation
		System.out.println("the sum of a and b is :"+a+b);
		System.out.println("the sum of a and b is :"+(a+b));
		String header ="Amazon India ";
		System.out.println("the header of amazon is: " + header);
		

	}

}
