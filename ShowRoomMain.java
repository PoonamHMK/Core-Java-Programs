package oops.poonam.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ShowRoom{
	String name;
	long mobnum;
	double cost;
	double dis;
	double amount;

	 ShowRoom() {
			name = null;
			mobnum = 0;
			cost = 0.0;
			dis = 0.0;
			amount = 0.0;
		}
	
	void input() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter Name :");
		name = br.readLine();
		System.out.println("Enter mobile number :");
		mobnum = Long.parseLong(br.readLine());
		System.out.println("Enter the cost of the item :");
		cost = Double.parseDouble(br.readLine());		
	}
	
	void calculate() {
		if(cost<=10000) {
			dis = (cost*0.05);
		}
		else if(cost>10000 && cost <=20000) {
			dis = (cost*10)/100;
		}
		else if(cost>20000 && cost<=35000) {
			dis = (cost*15)/100;
		}
		else {
			dis = (cost*20)/100;
		}
		System.out.println("Discount amount is Rs " +dis);
		amount = cost - dis;
}
   void display(){
		System.out.println("customer name is = " +name);
		System.out.println("cust mobile number is = " +mobnum);
		System.out.println("Amount to be paid after discount is Rs " +amount);
	}
}

public class ShowRoomMain  {

	public static void main(String[] args)throws IOException  {
	
		ShowRoom sr=new ShowRoom();
		sr.input();
		sr.calculate();
		sr.display();

	}

}

