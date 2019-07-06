package JavaSessions;

import java.util.ArrayList;


public class ArraysPractise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int data1[] [] = {{10,20,30},{11,12,13},{22,44,55}};
		//to store data in tow dim array using nested  loop
	/*	int students[][]= new int [4] [2];
		for(int rows=0;rows<4; rows++)// 01 ,02...049
		{
			
			for(int cols=0;cols<2;cols++)
			{
				
				students[rows][cols]=(rows-cols);
			}
			
		}
		
		System.out.println(students[0][1]); **/
		
		ArrayList<Integer> ar= new ArrayList<Integer>();
		ar.add(11);
		ar.add(44);
		ar.add(77);
		ar.add(99);
		ar.add(9);
		System.out.println("the size is"+ " "+ar.size());
		for (int i =0;i<ar.size();i++)
		{
			
System.out.println(ar.get(i));
		
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
