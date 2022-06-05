import java.util.Scanner;


public class Discount {

        int cost;
		String name;
		double dc;
		double amt=0;
	
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer name");
	    name=sc.next();
		System.out.println("Enter the price");
	    cost = sc.nextInt();
	
	}
	public void cal() {
		if (cost>5000 && cost<=10000) 
			{
				dc=(cost*10)/100;
				amt=amt-dc;
			}
			else if (cost>10000 && cost<=15000)
			{
				dc=(cost*15)/100;
				amt=amt-dc;
			}
			else if(cost>15000)
			{
				dc=(cost*20)/100;
				amt=amt-dc;
			
			}
		}
	
		
	
	public void display() {
		System.out.println("Name of the customer: "+name);
		System.out.println("Cost of an article: "+cost);
		System.out.println("Article discount amount: "+dc);
		System.out.println("Amount to be paid: "+amt);
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Discount dis=new Discount();
		dis.input();
		dis.cal();
		dis.display();

}
}
