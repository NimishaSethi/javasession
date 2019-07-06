package abstraction;

public  abstract class Car {
	int color;
	/*public Car() {
		System.out.println("car ---Stop");
		
	} 	*/
	
	public abstract void start();
	public void stop()
	{
		System.out.println("car ---Stop");
	}

}
