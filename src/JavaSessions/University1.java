package JavaSessions;

import java.util.ArrayList;


public class University1 {
	String name;
	String country;
	String stablisheddate;
	ArrayList <String> courses;

	 
	 public University1()
	 {
		 System.out.println("0 parameter constructor");  
		 
	 }
	 public University1(String name)
	 {
		 System.out.println("1 parameter constructor"); 
		 this.name=name;
		 System.out.println(name); 
	 }
	 
	 public University1(String country,String name,ArrayList <String> courses)
	 {
		 System.out.println("3 parameter constructor");
		 this.name=name;
		 this.country=country;
		 this.courses= courses;
		 System.out.println(name+" "+country); 
	 }
	 
	 public University1(String country,String name,String stablisheddate)
	 {

		 System.out.println("3 parameter constructor");
		 this.name=name;
		 this.country=country;
		 this.stablisheddate=stablisheddate;
		 System.out.println(name+" "+country+" "+stablisheddate); 
	 }
	 
	 
	public String getUniversityname (String name)
	{
	
	 return name;
		
	}
	
	public String getUniversityCountryLocated(String country)
	{
	
	 return country;
		
	}
	
	
	public String getUniversitydate(String stablisheddate)
	{
	
	 return stablisheddate;
		
	}
	

	
	public ArrayList<String> getalldata(ArrayList <String> courses )
	{
		
	
		return courses;
		
		
	}	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//constructor parameter pass
		//University1 uni= new University1("Srm");
		
		//University1 uni2= new University1("India" ,"Srm","10-01-1989");
	//	University1 uni3= new University1();
		
		//arraylist
		ArrayList <String> courses = new ArrayList<String>();
		courses.add("physics");
		courses.add("chemistry");
		courses.add("biology");
		courses.add("maths");
		courses.add("History");
		University1 uni1= new University1("India" ,"Srm",courses);
		System.out.println(uni1.courses);
		
		
		
		
		
		
		
		//get and return  method  calling 
		/*String country=	uni3.getUniversityCountryLocated("india");
		System.out.println(country);
		String university=	uni3.getUniversityname("VIT");
		System.out.println(university);
		String date=uni3.getUniversitydate("27-02-02000");
		System.out.println(date);
		ArrayList <String> cour=uni3.getalldata(courses);
		System.out.println(cour); */
		
		
		
		
	
	}

}
