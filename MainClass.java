package oops.poonam.com;

import java.util.Scanner;

class Student{
	//called instance variable
			String name;
            int sid;
			float fees;
			
			void input() {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a name");
				name=sc.nextLine();
				
				System.out.println("Enter a student id");
				sid=sc.nextInt();
				System.out.println("Enter fees");
				fees=sc.nextFloat();
			
			}
			void display() {
				System.out.println("name="+name);
				System.out.println("id="+sid);
				System.out.println("fees="+fees);
			}
		}

	
	public class MainClass {
	
		public static void main(String[] args) {
			 System.out.println("Main");
		         //local variable
		     Student sob=new Student();
		     System.out.println("id="+sob.sid);
		     System.out.println("name="+sob.name);
		     System.out.println("fees"+sob.fees);
		
		     sob.input();       //function
		     sob.display();    //calling member function
		        
	}

}
