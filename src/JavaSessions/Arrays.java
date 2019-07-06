package JavaSessions;



public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//integer array
		int i[]= new int [5];
		i[0]=22;
		i[1]=32;
		i[2]=42;
		i[3]=52;
		i[4]=62;
		//String array
		String str[]= {"nimisha","sethi","Glasgow","SRMUniversity"};
		//Integer print number s using while loop
		int j =0;
		while(j<i.length)
		{
	System.out.println(i[j]);
	   j++;
			
		}
		
		//String array print number using while loop
		int size=str.length;
		int l =0;
		while(l<size)
		{
			System.out.println(str[l]);	
			l++;
			
			
		}
		//Reverse the array
		Object EmployeeData[]= {"nimisha",'2',"sethi",26,1989,"10jan"};
		int counter=EmployeeData.length;
		for( int s =5;s>=0;s--)
		{
		System.out.println(EmployeeData[s- 1]);	
			
			
		}
		
	}

}
