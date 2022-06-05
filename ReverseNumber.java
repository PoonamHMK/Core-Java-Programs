import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,digit,rev=0;
		System.out.println("Enter a number");
		num=sc.nextInt();
		
		//input num=123      output 321
		 
		
		while(num!=0) {
			digit=num%10;
			//System.out.print(digit);
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println("Reversed num is");
			
		}
         
	}


