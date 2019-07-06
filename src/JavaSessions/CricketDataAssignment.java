package JavaSessions;

public class CricketDataAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object[] CricketData = {"name", "age", "team name", "DOB", "gender", "Strike Rate"};
		//Object CricketData[]= new Object [6]; //initialization and allocation of emory
		Object [] CricketData1={"Virat", 30, "India", "10-01-1989", 'F', 12.5};
		Object [] CricketData2={"kohli", 31, "Bharat", "10-01-1989", 'M', 17.5};
		
		//cricket data 
		for (int i =0; i<CricketData.length; i++)
		{
			
			System.out.println(CricketData[i]);
		}
		//cricketdata1
		for (int k =0; k<CricketData1.length; k++)
		{
			
			System.out.println(CricketData1[k]);
		}
		
		//cricketdata2
		
		for (int j =0; j<CricketData1.length; j++)
		{
			
			System.out.println(CricketData1[j]);
		}
		

	}

}
