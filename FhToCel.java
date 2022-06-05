import java.util.Scanner;

public class FhToCel {

	public static void main(String[] args) {
		int choice;
		float tem,f,c;
		Scanner sc=new Scanner(System.in);
		
		
		
		System.out.println("***************MENU****************");
		System.out.println("1.Fahrenheit to Celcius");
		System.out.println("2.Celsius to fahrenheit");
		System.out.println(" Please enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		
		case 1:System.out.println("Enter the temperature in fh");
		     f=sc.nextFloat();
			tem= (f-32)*5/9;
			System.out.println("Converted temp in cel is " +tem+"°C" );
		      break;
		case 2:System.out.println("Enter the temperature in celsius");
		c=sc.nextFloat();
			tem=c*9/5+32;
			System.out.println("converted temp in fahrenheit is "+tem+"F" );
	        	
		    break;
				
		default:System.out.println("Invlid input");
		}
		

	}

}
