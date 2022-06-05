import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		int i,num,factorial=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		num=sc.nextInt();
		i=num;
		while(i>=1) {
			factorial=factorial*i;
			i=i-1;
			}
          System.out.println("Factorial of "+num+" is "+factorial);
	}

}
