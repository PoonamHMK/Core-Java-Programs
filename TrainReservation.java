package oops.poonam.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Railway{
	String name;
	String coach;
	Long mobnum;
	String firstAc,secondAc,thirdAc,sleeper;
	int amount,total_amount,tickets;
	
	void accept() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter the name of the passanger :");
		name=br.readLine();
		System.out.println("Enter the Coach type :");
		System.out.println("first");
		
		System.out.println("second");
	
		System.out.println("third");
	
		System.out.println("sleeper");
	
		coach=br.readLine();
		
	    System.out.println("Enter the Mobile Number :");
		mobnum=Long.parseLong(br.readLine());
		System.out.println("Enter the number of tickets");
		tickets=Integer.parseInt(br.readLine());
	}
	void calculate() {
		if(coach.equals("first")) {
			amount=750;
		}
		else if(coach.equals("second")) {
			amount=500;
		}
		else if(coach.equals("third")){
			amount=250;
		}
		else {
		amount=0;
		
	}
		total_amount=amount*tickets;
}
	void update() {
		System.out.println("Name of Passanger:- "+name);
		System.out.println("Enter the coach Type:- "+coach);
		
		System.out.println(" Mobile Number:- "+mobnum);
		System.out.println("Number of tickets:- "+tickets);
		System.out.println("Total amount need to pay for "+tickets+" ticket is "+total_amount+" Rupees");
	}
}



public class TrainReservation {
	public static void main(String[] args) throws IOException {
		Railway ob=new Railway();
		ob.accept();
		ob.calculate();
		ob.update();
		


	}

}
