package JavaSessions;

public class IncrementandDecrementOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j =++i;
		System.out.println(i);//2
		System.out.println(j);//2
		int  m =1;
		int  n = m++; //Post Increment 
		System.out.println(m);//2
		System.out.println(n);//1
		//m incremented so 2 and n is before m incremental
		int p =100;
		int q=++p;
		System.out.println(p);
		System.out.println(q); 
		int d =2;
		int c= --d;
		System.out.println(d);//1
		System.out.println(c);//1
		
		int g=2;
		int h =g--;//post decrement 
		System.out.println(g);//1
		System.out.println(h);//2
	}

}
