package poonam.com;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		int s1,s2,s3,s4,s5,s6;      
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("FIrst subject marks");
		s1=sc.nextInt();
		System.out.println("Second subject marks");
		s2=sc.nextInt();
		System.out.println("Third subject marks");
		s3=sc.nextInt();
		System.out.println("Fourth subject marks");
		s4=sc.nextInt();
		System.out.println("Fifth subject marks");
		s5=sc.nextInt();
		System.out.println("Sixth subject marks");
		s6=sc.nextInt();
		
		avg=(float)(s1+s2+s3+s4+s5+s6)/6;
		System.out.println("average marks="+avg);

	}

}
