package Array.pack;

import java.util.Scanner;

public class TowDimensionalArray2 {

	public static void main(String[] args) {
		int b[][];
		int n,m;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		m=sc.nextInt();
		System.out.println("Enter number of columns");
		n=sc.nextInt();
		                //m= no of rows n= no of columns
		b=new int[m][n];
		System.out.println("Enter "+m+"X"+n+" matrix");
         for(int r=0; r<m; r++) {
        	 for(int c=0; c<n; c++) {
        		 b[r][c]=sc.nextInt();
        		 
        	 }
         }
         System.out.println("Entered matrix is");
         for(int r=0; r<m; r++) {
        	 for(int c=0; c<n; c++) {
	         System.out.print(b[r][c] +" ");
       }
             System.out.println();
         }
	}
}
