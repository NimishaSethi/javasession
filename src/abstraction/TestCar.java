package abstraction;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW b = new BMW();
	
		/*b.start();
		b.stop();//it will call BMW overridden method
		b.automobileStopaage(); */
		//TopCasting
		Car c1= new BMW();// Parent class reference variable 
		//always overiddden method call
		c1.start(); //because C1 is the part of BMW object so it will call BMW methods
		c1.stop(); 
		//we cannot call child class method means method present in Childclass with the help of referecne variable
        //c1.automobileStopaage();  we cannot do this as it is bmw own method which is not ioverridden              */
	}

}
