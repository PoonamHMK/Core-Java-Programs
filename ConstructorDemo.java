package oops.poonam.com;

import java.util.Scanner;

class BaseClass {
	String name;
	int qt;
	float cost;
	
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Brand");
		name=sc.nextLine();
		System.out.println("Enter Quantity");
		qt=sc.nextInt();
		//System.out.println("Enter cost");
		//cost=sc.nextFloat();
	}
	void calculation() {
		String dairymilk , fivestar;
	
		if(name.equals("dairymilk")) {
			cost=5*qt;
		}
		else if(name.equals("fivestar")) {
			cost=10*qt;
		
		}
		else {
		System.out.println("invalid");
		}
	}
	void display() {
		System.out.println("name= "+name);
		System.out.println("quqntity= "+qt);
		System.out.println("cost= "+cost);
	}
}


public class ConstructorDemo {

	public static void main(String[] args) {
		BaseClass ob=new BaseClass();
		ob.input();
		ob.calculation();
		ob.display();
         
	}

}
