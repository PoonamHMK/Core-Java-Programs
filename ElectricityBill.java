package poonam.com;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		float units;
		double fixed_rate=350,bill_payable;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of units");
		units=sc.nextLong();
		if(units<100) {
			bill_payable=units*1.50;
		}
		else if(units>=101 && units<=150) {
			bill_payable=100*1.50+(units-100)*2.00;
		}
		else if(units>=151 && units<=250) {
			bill_payable=100*1.50+50*2.00+(units-150)*2.50;
		}
		else {
			bill_payable=100*1.50+50*2.00+100*2.50+(units-250)*4.00;
		}
          System.out.println("Total bill amount is "+(bill_payable+fixed_rate));		

	}

}
