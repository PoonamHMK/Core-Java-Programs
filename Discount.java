package poonam.com;

import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		float rate,amount;
		Scanner sc=new Scanner(System.in);
     System.out.println(" Enter the rate of the product");
     rate=sc.nextFloat();
     if(rate>=1000 && rate <=2000) {
    	 amount=(rate*2)/100;
    	 }
     else if(rate>=2001 && rate<=4000) {
    	 amount=(rate*3)/100;
    	 
     }
     else if(rate>=4001 && rate<=6000) {
    	 amount=(rate*4)/100;
    	 
    		
     }
     else {
    	 amount=(rate*5)/100;
    	 
     }
     System.out.println("Amount after discount " +amount);
     System.out.println("Amount to be paid Rs."+(rate-amount));
	}
	

}
