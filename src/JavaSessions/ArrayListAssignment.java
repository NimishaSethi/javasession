package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> tiles= new ArrayList <String> ();
		tiles.add("Red");
		tiles.add(0, "White");
		tiles.add("blue");
		tiles.add("purple");
		tiles.add("yellow");
		tiles.add(5, "Black");
	System.out.println("List of elements "+" "+tiles);
	for (int i =0;i <tiles.size();i++)
	{
		
		System.out.println(tiles.get(i));
	} 
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*if(tiles.contains("Red"))
		{
			System.out.println("element found");	
		}
		else
		{
		System.out.println(" there is no such element present ");	
		} **/
		
	//tiles.clear();
	//System.out.println("list of elements after clear" +" "+ tiles);
	//tiles.remove(2);
			//System.out.println(tiles);
			//Collections.reverse(tiles);
			//System.out.println(tiles);
			//List<String> subList=   tiles.subList (0,4);
			//System.out.println("List of first three elements: " +subList);
			//Collections.swap(tiles, 4, 5);
			//System.out.println("List after swap"+" "+tiles);
	
	/* System.out.println("Let trim to size the above array: ");
    tiles.trimToSize();
    System.out.println(tiles);
    for (String color : tiles) { 
        System.out.println("color = " + color); 
    } **/
		
		
		
		
		
		
		
		
		//System.out.println(tiles.get(5));
		//System.out.println(tiles);
		//tiles.set(2, "New Blue");
		//System.out.println(tiles);
		/*System.out.println("the number of colors present in tiles "+" "+tiles.size());
		for (int i =0;i <tiles.size();i++)
		{
			
			System.out.println(tiles.get(i));
		} **/
		

	}

}
