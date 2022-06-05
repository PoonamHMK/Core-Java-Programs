package pkg.string;

import java.util.Scanner;

public class UserCredentialCheck2 {

	public static void main(String[] args) {
		String uname,upass;
		int i;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("You have maximum 3 attempts");
		for(i=1; i<=3; i++) {
		
		    System.out.println("Enter your name");
		    uname=sc.next();
		    System.out.println("Enter your passwors");
	    	upass=sc.next();
		
		if(uname.equals("world") && upass.equals("world123")) {
			 System.out.println("Login successful");
			 break;
	}
		
	else {
		if(i==1) {
		System.out.println("Invalid uname or password");
		System.out.println(i+" attempt is over");
		}
	else {
			System.out.println("Invalid uname or password");
			System.out.println(i+" attempts are over");
			
			
			
		}
	}
	} //end of for loop
		if(i==4) {
		System.out.println("Sorry your account is locked you can try after 24 hours");
		
		}
	}
	
		

	

}
