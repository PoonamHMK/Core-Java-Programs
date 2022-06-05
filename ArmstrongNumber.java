import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum=0,num,digit,num1;
		System.out.println("Enter a number");
		num=sc.nextInt();
		num1=num;
		while(num!=0) {
			digit=num%10;
			sum=sum+digit*digit*digit;
			num=num/10;
			
		}
          if(sum==num) {
        	  System.out.println("The number is Armstrong number");
        	  
          }else {
        	  System.out.println("The number is not Armstrong number");
          }
	}

}
