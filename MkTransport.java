package oops.poonam.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Transport{
	String name;
	int w;
	int charge;
	float surge_charge=0.05f;
	void accept() throws IOException {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		System.out.println("Enter the name of the customer");
		name=br.readLine();
		System.out.println("Enter weight of the parcel in KG's");
		w=Integer.parseInt(br.readLine());
	}
	void calculation() {
		if(w<=10) {
			charge=w*25;
		}
		else if(w>=10 && w<=20) {
			charge=10*25+((w-10)*20);
		}
		else {
			charge=10*25+20*20+(w-30)*10;
		}
		
		
	}
	void print() {
		System.out.println("Name\tWeight\tBill Amount ");  
		System.out.println("--------------------------------------");
		System.out.println(name+"\t"+w+"\t"+(charge+(charge*0.05)));
		
	}
}

public class MkTransport {

	public static void main(String[] args)throws IOException {
		Transport t=new Transport();
		t.accept();
		t.calculation();
		t.print();

	}

}
