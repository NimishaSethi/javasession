package javainterface;

public class TestInterfaceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FortisHospital fh= new FortisHospital();
		fh.ambulanceservices();
		fh.herattransplant();
		fh.medicalInsuranceServics();
		fh.oncologyservices();
		fh.medicalInsuranceServics();
		// Topcasting
		UsMedical us= new FortisHospital();
		// we can call only  those methods present in UsMedical Interference we cannot call Fortis Hospital methods 
		us.ambulanceservices();
		//Usmedical us1= new Usmedical();
		//it will not allow to make object of interface
		//UsMedical.min_fees =100;
		//we cannot altered final(all variables in interface are final and static )variable of interfaces
		//fh.specialmethod(); // it will call special method
		us.specialmethod();
		UsMedical.sendMail();
		//it will call Static method with the help of class name
		
		
		
		
		
		

	}

}
