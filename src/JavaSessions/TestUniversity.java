package JavaSessions;

public class TestUniversity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		University uni= new University();
		/* String name =uni.getplaygroundname("Green Park");
          System.out.println(name);
          //we can access private variable with the help of set and get(its just a keyword use it or not)
          uni.setclassname("nimisha");
          System.out.println(uni.classname()); */
//Inherited property along with access of private variables and private methods
          /* Stanford stan= new Stanford();
          stan.regularClasses("naveen class");
          stan.setclassname("nimisha private");
          System.out.println(stan.classname());
          stan.getplaygroundname("ayr park");
          uni.regularClasses("udemy");
          
          //Parent method calling
           uni.regularClasses("Standard parent claseses"); /*/ // it will call Parent class
           // we cannot call method from parent class variabl which are present in child class IT WILL NOT GIVE OPTIO TO WRITE
           
          
          
// overrideen method and its calling overridden/child method
          MIT mit= new MIT();
          NYU nyu= new NYU();
         /* mit.eveningClasses("mit evening class");
          mit.regularClasses("mit regularclassname");// it is calling child method
          mit.PHDCourse("PHDCoursename");
          
          NYU nyu= new NYU();
          nyu.eveningClasses("nyu evening class");
          nyu.regularClasses("nyu regularclassname");// it is calling child method
          nyu.PHDCourse("NYUPHDCoursename"); */
          
      
          
       
          // Top casting and Downcasting
          
          University uni1= new MIT(); 
          //use surname concept instance of keyword
          //child can be the instance of parent
        if(uni instanceof University)
        {
        	System.out.println("pass");
        }
        if(nyu instanceof NYU)
        {
        	System.out.println("pass");
        }  
          
        if(nyu instanceof University)
        {
        	System.out.println("pass");
        }  
          
          
          //Downcasting// It will give run time error CLASSCASTEXCEPTION
          //MIT m1= (MIT) new University(); 
          
          
          
          
          
          
          
          
          
          
          
          
          
         
	}

}
