package poonam.com;

import java.util.Scanner;

public class EmployeeData {

	public static void main(String[] args) {
		String name;
		int age;
		float sal;
		char gen;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter employee name ");
		name=sc.nextLine();
		System.out.println(" Enter employee age ");
		age=sc.nextInt();
		System.out.println("Enter employee salary");
		sal=sc.nextFloat();
	    System.out.println(" Enter employee gender");
	    gen=sc.next().charAt(0);		
	    
	    System.out.println(" Employee details");
	    System.out.println(" Name="+name);
	    System.out.println(" Age="+age);
	    System.out.println(" Salary="+sal);
	    System.out.println(" Gender="+gen);
	    
	    
}

}
