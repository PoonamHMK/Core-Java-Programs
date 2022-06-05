package oops.poonam.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

   class salary{
	String name,add,sub_spl;
	long mobnum;
	int monthly_sal;
	float income_tax;
	
	void accept() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter the name of the teacher");
		name=br.readLine();
		System.out.println("Enter the address");
		add=br.readLine();
		System.out.println("Enter the mobile number");
		mobnum=Long.parseLong(br.readLine());
		System.out.println("Enter subject specialisation");
		sub_spl=br.readLine();
		System.out.println("Enter the salary");
		monthly_sal=Integer.parseInt(br.readLine());
	}
	   void calculation() {
		 income_tax = monthly_sal*0.05f;
		
   }
       void display() {
    	   System.out.println("Name= "+name);
    	   System.out.println("Address= "+add);
    	   System.out.println("Subject= "+sub_spl);
    	   System.out.println("Total salary= "+monthly_sal);
    	   System.out.println("income_tax= "+income_tax);
	   
       }
		   
}
		
       public class SalaryTax {
	   public static void main(String[] args) throws IOException {
		salary sr=new salary();
		sr.accept();
		sr.calculation();
		sr.display();
	}
		
		

	}


