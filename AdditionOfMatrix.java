package Array.pack;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		int a[][],b[][],c[][],r1,r2,c1,c2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows and columns of first matrix");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter rows and columns of second matrix");
		r2=sc.nextInt();
		c2=sc.nextInt();
		
		if(r1==r2  && c1==c2) {
			a=new int[r1][c1];
			b=new int[r2][c2];
			c=new int[r1][c1];
			
			//first matrix
			System.out.println("Enter the elements of first Matris "+r1+"X"+c1);
			for(int i=0; i<r1; i++) {
				for(int j=0; j<c1; j++) {
					a[i][j]=sc.nextInt();
				}
			}
			
			//second matrix
			System.out.println("Enter the elements of second Matris "+r2+"X"+c2);
			for(int i=0; i<r2; i++) {
				for(int j=0; j<c2; j++) {
					b[i][j]=sc.nextInt();
				}
			}
			
			//Addition 
			  for(int i=0; i<r2; i++) {
				for(int j=0; j<c2; j++) {
		        	c[i][j]=a[i][j]+b[i][j];
			
		}
			  }
			  //Display matrix
			  System.out.println("Addition of two matrices");
			  for(int i=0; i<r2; i++) {
					for(int j=0; j<c2; j++) {
			        	System.out.print(c[i][j]+" ");
					
	}
				System.out.println();

	}
   }//if
		else {
			System.out.println("Matris addition is not possible");
		}
	
}
}
