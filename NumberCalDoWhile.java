import java.util.Scanner;

public class NumberCalDoWhile {

	public static void main(String[] args) {
	
		int firstnum,secondnum,answer,choice;
		char ch;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter first number ");
		firstnum=sc.nextInt();
		System.out.println("Enter second number");
		secondnum=sc.nextInt();
		
		System.out.println("***********MENU**************");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Remainder");
		System.out.println("Please enter your choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:answer=firstnum+secondnum;
		    System.out.println("Sum of "+firstnum+" and "+secondnum+" is " +answer);
		    break;
		case 2: answer=firstnum-secondnum;
            System.out.println("Difference of "+firstnum+" and "+secondnum+" is " +answer);	
            break;
		case 3: answer=firstnum*secondnum;
		    System.out.println("Product of "+firstnum+" and "+secondnum+" is " +answer);
		    break;
		case 4: answer=firstnum/secondnum;
		    System.out.println("Quotient of "+firstnum+" and "+secondnum+" is "+answer);
		    break;
		case 5:answer=firstnum%secondnum;
		System.out.println("Remainder of "+firstnum+" and "+secondnum+" is " +answer);
		    break;
		    default:System.out.println("Invalid input");
		    	}
		
        System.out.println("Do you want to countinue Yes/No");
        ch=sc.next().charAt(0);
}
		while(ch!='N');
	}
	}
