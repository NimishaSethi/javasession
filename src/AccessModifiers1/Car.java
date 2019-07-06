package AccessModifiers1;

import AccessModifiers.Animal;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a1= new Animal(); // we need to import animal class if we are creating object of other package.
		//a1.eat(); // we cannot access its method as it is default access modifier
		//a1.eat();	// but we can access it if we make access modifier as PUBLIC. 

	}

}
