package Array.pack;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		int sum=0;
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter "+a.length+" elements");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
          System.out.println("Entered Arry elemrnts are");
          for(int i=0;i<a.length;i++) {
          System.out.println(a[i]);
	}
          
         System.out.println("To find sum of all array elements");
         for(int i=0;i<a.length;i++) {
        	 sum=sum+a[i];   // sum=0+4=4 sum=4+6=10 sum=10+9=19.......
         }
         System.out.println("sum="+sum);
	}
	      
         
}
