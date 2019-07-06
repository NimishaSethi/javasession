package javainterface;

public interface UsMedical extends WhoInterface {
	
	int min_fees= 4000;
	 
	public void cardioservices();
	public void ambulanceservices();
	public void childcareservices();
	public void outpatientservices();
	// method defined in interface along with body with the help of default keyword(after JDk 1.8)
	default void specialmethod()
	{
	System.out.println("special method");	
	}
	
	static void  sendMail()
	{
		
		System.out.println("Send mail mathod");
	}

}
