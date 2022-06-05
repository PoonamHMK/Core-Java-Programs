import java.util.Scanner;

public class LoopFactorial {

	public static void main(String[] args) {
	int i,num,factorial=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	num=sc.nextInt();
	for(i=num;i>=1;i--) {
		factorial=factorial*i;
	}
        System.out.println("Factorial of 5" +num+" is " +factorial);
	}

}
