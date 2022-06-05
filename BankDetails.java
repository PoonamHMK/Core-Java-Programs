//Program to display Bank details.

import java.util.Scanner;

public class BankDetails {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Banking program");
		System.out.println("1.Amount to be deposited");
		System.out.println("2.Amount to be withdrawn");
	    System.out.println("3.Display the balance");
     	System.out.println("Choose the type of cenversion");
     	float amount=10000;
     	float deposite_amount,withdraw_amount,balance;
     	int choice;
     	choice=sc.nextInt();
     	switch(choice) {
     	case 1: System.out.println("Enter the amount to be deposited");
     	        deposite_amount=sc.nextInt();
     	        balance=amount+deposite_amount;
     	        System.out.println("The balance amount is "+balance+" Rs");
     	        break;
     	case 2: System.out.println("Enter the amount to be withdrawn");
     	        withdraw_amount=sc.nextInt();
     	     if(withdraw_amount<amount) {
     	        balance=amount-withdraw_amount;
     	        System.out.println("The balance amount is "+balance+" Rs");
     	         }
     	     else {
     	    	System.out.println("Insufficient balance");
     	     }
     	         break;
     	case 3: System.out.println("Your account balance is "+amount+" Rs");
     	default: System.out.println("Invalid input");
     	
     	}
   }
}
