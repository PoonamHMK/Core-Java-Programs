//Single inheritance
package inheritancejava;

import java.util.Scanner;

class Employee{
	float salary;
	Employee(){
		salary=50000;
		}

}
  class Programmer extends Employee{
	  String name;
	  int age;
	  
	  void input() {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the name");
		  name=sc.next();
		  System.out.println("Enter the age");
		  age=sc.nextInt();
	}
	  void display() {
		  System.out.println("Name= "+name);
		  System.out.println("Age= "+age);
		  System.out.println("Salary= "+salary);
	  }
}
  
     public class MainEmployeeClass {

	       public static void main(String[] args) {
		     Programmer ob=new Programmer();
		     ob.input();
		     ob.display();
		     
		     

	}

}
     class string_class 
     {
         public static void main(String args[])
         {
             String obj = "hello";
             String obj1 = "world";   
             String obj2 = obj;
             obj2 = " world";
             System.out.println(obj + " " + obj2);
         }
     }
