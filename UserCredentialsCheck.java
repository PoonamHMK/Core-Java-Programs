package pkg.string;

import java.util.Scanner;

public class UserCredentialsCheck {

	public static void main(String[] args) {
		String username,userpassword;
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener your name");
        username=sc.next();
        System.out.println("Enter your password");
        userpassword=sc.next();
        
        if(username.equalsIgnoreCase("world")  && userpassword.equals("world123")) {
        	System.out.println("Login successful");
        	
        }
        else {
        	   System.out.println("Invalid username or password");
        }
	}

}
