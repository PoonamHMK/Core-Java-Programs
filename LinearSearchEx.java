package Array.pack;

import java.util.Scanner;

public class LinearSearchEx {

	public static void main(String[] args) {
		int size,search_element,pos=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size");
		    size=sc.nextInt();
		int a[]=new int [size];
		System.out.println("Enter "+size+" elements");
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
			
	}    System.out.println("Enter search element");
	     search_element=sc.nextInt();
	     
	     // Liner search
	       for(int i=0; i<size; i++) {
	    	   if(search_element==a[i]) {
	           pos=i+1;
	    	   break;
	     }
      }
             if(pos>0) {	       
           System.out.println(search_element+" found at position "+pos);
           System.out.println("Successful search");
           
}
             else {
            	 System.out.println(search_element+" not found ");
            	 System.out.println("Unsuccessful search");
             }
}
}