package poonam.com;

import java.util.Scanner;

public class DivisibleMain {

	public static void main(String[] args) {
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		n=sc.nextInt();
		if(n%5==0 && n%3==0) {
			System.out.println(" is divisible by 5 and 3");
		}
		else if(n%3==0) {
			System.out.println("is divisible by only 3");
		}
		else if(n%5==0) {
			System.out.println("is divisible by only 5");
		}
		else {
			System.out.println(" is not divisible by both numbers");
		}
	}

}
