package JavaSessions;

public class Factorial {

	  public static int fact(int x){
		    if(x == 0 || x == 1){
		      return 1;
		    }
		    else{
		      return fact(x-1)*x;
		    }
		  }

		  public static void main(String[] args) {
		    System.out.println(fact(4));
		    System.out.println(fact(3));
		    System.out.println(fact(2));
		    System.out.println(fact(1));
		   
		  }
		}
