package poonam.com;

import java.util.Scanner;

public class SimpleInterest2 {

	public static void main(String[] args) {
		float p,t,r,si;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the principle amount");
		p=sc.nextFloat();
		System.out.println("Enter the Duration");
		t=sc.nextFloat();
		System.out.println("Enter the rate of interest");
		r=sc.nextFloat();
		si=(p*t*r)/100;
		System.out.println("simple interest is " +si);
		
		

	}

}
