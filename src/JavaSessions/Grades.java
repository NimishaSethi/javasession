package JavaSessions;
public class Grades {
	public static void main(String[] args) {
		 String Grade= grades(78);	
		 System.out.println(Grade);
	}
	public static String grades( int marks )
	{
		

	if(marks>90 && marks<=100)
	{
	return "AA";
	}
	else if(marks>80 && marks<=90)
	{
		return "AB";
	}
	else if(marks >71 && marks <=80)
	{
	return "BB" ;
	}
	else if(marks >61 && marks <=70)
	{	
		return "BC";
	}
	else if(marks >51 && marks <=60)
	{
		return "CD";	
	}
	else if(marks >41 && marks <=50)
	{
		return "DD";	
	}
	else {
	
		System.out.println( "fail");
	}
	 return null;	
	}

}
