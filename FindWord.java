//pgm to find word Occurrance
package pkg.string;

import java.util.Scanner;

public class FindWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		int c=0;
		System.out.println("enter a sentence");
		s=sc.nextLine();  //
		String ch[]=s.split(" ");
		System.out.println("Enter word to search");
		String w=sc.next();
		for(int i=0; i<ch.length; i++) {
			if(ch[i].equals(w)) {
				c++;
				
			}
		}
		System.out.println("Occurrance of word "+c);
		
		
		}

}
