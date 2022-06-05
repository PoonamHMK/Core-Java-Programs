package firstpackage;

class Bank{
	float inst;
	void rateOfInterest() {
		System.out.println("Rate of Interest= "+inst);
		
	}
}
 class SBI extends Bank{
	 void rateOfInterest() {
		 inst=8;
		 System.out.println("RAte of interest= "+inst);
	 
		 }
	 }
  class ICICI extends Bank{
	  void rateOfInterest() {
			 inst=9;
			 System.out.println("Rate of interest= "+inst);
	  } 
  }

public class BankMainClass {

	public static void main(String[] args) {
		Bank ob;
		ob=new SBI();     //Refers to SBI
		ob.rateOfInterest();
		ob=new ICICI();
		ob.rateOfInterest();
		
	}

}
