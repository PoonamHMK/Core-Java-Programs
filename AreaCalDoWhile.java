import java.util.Scanner;

public class AreaCalDoWhile {

	public static void main(String[] args) {
		 float length,breadth,base,height,radius,side,area;
			int choice;
			char ch;
			Scanner sc=new Scanner(System.in);
		do {
			System.out.println("**************MENU**************");
			System.out.println("1.Area of square");
			System.out.println("2.Area of Rectangle");
			System.out.println("3.Area of circle");
			System.out.println("4.Area of Triangle");
	        System.out.println("Please enter your choice");
	        choice= sc.nextInt();
	        
	        switch (choice) {
	        case 1:System.out.println("3 Find the area of Square");
	               System.out.println("Enter side of square");
	               side=sc.nextFloat();
	               area=side*side;
	               System.out.println("Area of square of side "+side+" is "+area);
	           break;
	        case 2:System.out.println("Find the area of rectangle");
	               System.out.println("Enter length of rectangle");
	               length=sc.nextFloat();
	               System.out.println("Enter breadth of rectangle");
	               breadth=sc.nextFloat();
	               area=length*breadth;
	               System.out.println("Area of rectangle of length "+length+" and breadth "+breadth+" is " +area );
	            break;
	        case 3:System.out.println("Find the arae of circle");
	               System.out.println("Enter radius of a circle");
	               radius=sc.nextFloat();
	               area=3.14159f*radius*radius;
	               System.out.println(" Area of circle of radius "+radius+" is "+area);
	            break;
	        case 4: System.out.println("Find the area of triangle ");
	                System.out.println("Enter height of a triangle");
	                height=sc.nextFloat();
	                System.out.println("Enter breadth of a triangle");
	                breadth=sc.nextFloat();
	                area=(height*breadth);
	                System.out.println("Area of triangle of height "+height+" and breadth "+breadth+" is " +area);
	           break;
	        
	           default:System.out.println("Invalid input");
	        

	}
	        System.out.println("Do u want to continue Y/N");
	        ch=sc.next().charAt(0);
		}

          while(ch!='N');
	}
}
	
	
