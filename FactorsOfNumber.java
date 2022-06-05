import java.util.Scanner;

// pgm to print factors of a given number
//input 24
//output 1,2,3,4,6,8,12,24
public class FactorsOfNumber {

	public static void main(String[] args) {
		int num,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		System.out.println("factors of "+num+" are ");
		
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
			}
		}
		
		

	}

}
