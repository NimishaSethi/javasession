package JavaSessions;

public class LoopsConcepts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10; //initialization
		while(i>=0)//conditional 
		{
			System.out.println(i);
			i--;// incremental
			
		}
		System.out.println("While loop finish");
		
		//Do while Loop
		int k =1;// counter
		do {  //if we want to execute the loop atleast once 
			
			System.out.println(k);
			k++;
			
		}
		
		while(k<=10);//while doesnot have any body
		System.out.println("do while loop finished");
		//For loop
		
		for(int p=0;p<=6;p++)
		{
		System.out.println(p);	
			
		}
		//print even numbers
		for (int j=0 ;j<=10;j=j+2)
		{
			
			System.out.println(j);		
		}
		
		

	}

}


