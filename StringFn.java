package pkg.string;

import java.util.Scanner;

public class StringFn {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String ms="";
		System.out.println("Enter a string");
		
		String s=sc.nextLine().toLowerCase();
		
		for(int i=0; i<s.length(); i++) {
			
			char ch=s.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u' ) {
			   continue;
			
					
		}
			else {
				 ms=ms+s.charAt(i);    //modified string
			}

	}
		System.out.println("Afetr removing vowels "+ms );

}
}
