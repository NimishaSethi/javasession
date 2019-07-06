package JavaSessions;

import java.util.ArrayList;

public class Browser {
	
	
	 String browserName;
	 String vendorName;
	 double currentVersion;
	 ArrayList<String>plugins;
	 
	 
	 public Browser() {
			super();
		}
	 
	public Browser(String browserName, String vendorName, double currentVersion) {
		
		System.out.println("this is 3 parameter constructor");
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		System.out.println(browserName+" "+vendorName+" "+currentVersion); 
		
	}

	public Browser(String browserName) {
		System.out.println("this is 1 parameter constructor");
		this.browserName = browserName;
		System.out.println(browserName); 
	}
	
public Browser(String browserName, String vendorName) {
		System.out.println("this is 2 parameter constructor");
		this.browserName = browserName;
		this.vendorName = vendorName;
		System.out.println(browserName+" "+vendorName);
	}
	//get and return method
	
	public String getbrowsername(String browserName)
	{
		return browserName;
		
	}
	

	public String getvendorname(String vendorName)
	{
		return vendorName;
		
	}
	
	
	
	public double getcurrentversion(double currentVersion)
	{
		return currentVersion;
		
	}
	
	public ArrayList<String> getpluginversion( ArrayList<String> plugin)
	{
		return plugin;
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String>plugins = new ArrayList<String>();
		 plugins.add("IE");
		 plugins.add("chrome");
		 plugins.add("firefox");
		 plugins.add("firefox1");
		 plugins.add("chropath");
		 
		Browser obj = new Browser();
		Browser br= new Browser("Chrome");
		Browser vr= new Browser("Chrome", "chromevendor", 12.45);
		Browser vend= new Browser("firefox", "firefoxvendor");
		String browsername=	obj.getbrowsername("chrome");
		System.out.println(browsername);
		double versionname=	obj.getcurrentversion(34.56);
		System.out.println(versionname);
		String vendorname=	obj.getvendorname("IER");
		System.out.println(vendorname);
		ArrayList<String> plugi=obj.getpluginversion(plugins);
		System.out.println(plugi);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

	

}
