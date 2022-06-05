package pkg.string;

import java.util.Scanner;

public class StringDemo2 {

	public static void main(String[] args) {
		String s;
		int w=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		s=sc.nextLine();
		String s1=s.toLowerCase();		
		System.out.println("Number of characters = "+s.length());
		
		for(int i=0; i<s.length(); i++) {
			char ch=s1.charAt(i);
			 if(ch==' ') {
				 w=w+1;
				 
			 }
		}
		System.out.println("Number of words = " +(w+1));

	}

}
