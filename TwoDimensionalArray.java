package Array.pack;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int b[][]=new int [3][3];     //two dimensional arry
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3x3 matrix");
		for(int r=0; r<3; r++) {
			for(int c=0; c<3; c++) {
				b[r][c]=sc.nextInt();
			}
		}
			System.out.println("Entered matrix is");
			for(int r=0; r<3;r++) {
				for(int c=0; c<3; c++) {
					System.out.print(b[r][c]+ " ");
			}
				System.out.println();
		}
		

	}

}
