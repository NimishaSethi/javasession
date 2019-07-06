package JavaSessions;

public class University {
	
	 private String classname;//initialize by setclassname
	String regularclassname;
	String eveningclassname;
	  String playgroundname;
		
	public String classname()//call this method and return 
	{
		System.out.println("classname"+ " "+classname);
		return classname;
		
	}
	
	
	public void setclassname(String classname)//local classname
	{
		
		this.classname= classname;
		//this.globalvariable = local classname
	}
	
	
	public void regularClasses(String regularclassname)
	{
		System.out.println("regularclassname"+ " "+regularclassname);	
	}
	
	public void eveningClasses(String eveningclassname )
	{
		System.out.println("eveningclassname"+ " "+eveningclassname);
		
	}
	
	
	//private method  access by creating public method make a object and pass a parameter in main class
	private String playground(String playgroundname )
	{
		
		return playgroundname;
		
	}

	public String getplaygroundname(String playgroundname)
	{
		System.out.println("playgroundname is"+ " "+playgroundname);
		return playground(playgroundname);
	}
	

	
	
	
	
	}


