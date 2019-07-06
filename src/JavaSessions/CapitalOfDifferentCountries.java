package JavaSessions;

import java.util.Scanner;

public class CapitalOfDifferentCountries {

	 public static void main(String[] args)
	    {
	       
	        Scanner obj=new Scanner(System.in);
	        String x[]={"India","Pakistan","Japan","Afghanistan"};
	        String y[]={"New Delhi","Ismabad","Tokyo","Kabul"};
	        System.out.print("Enter The Country Name");
	        String in=obj.nextLine();
	        
	        int flag = 0;
	        
	        for(int i=0;i<3;i++)
	        {
	            
	            if(in.equalsIgnoreCase(x[i]))
	            {
	                System.out.println(y[i]);
	                flag=1;
	              
	            }
	             
	        }
	        if(flag==0) {
	        	System.out.println("Invalid Country");
	        }
	       
	   }
		
		
	}


