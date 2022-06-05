package Array.pack;

import java.util.Scanner;

public class UserInputArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		int i;
		//datatype identifier[]=new datatype[size];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array elements "+a.length);
		for(i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			
		}
		System.out.println("Array elements are");
		for(i=0;i<a.length;i++) {
			System.out.println(a[i]);

}
}
}
