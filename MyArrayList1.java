package pack.poonam2;

import java.util.ArrayList;

public class MyArrayList1 {

	public static void main(String[] args) {
		ArrayList<Integer> a1=new<Integer> ArrayList();  //we can have only integer
		a1.add(52);
		a1.add(100);
		a1.add(12);
	 // a1.remove(1);
	 // a1.clear();
		System.out.println(a1);
		System.out.println(a1.contains(52));
		ArrayList<String> b1=new<String> ArrayList();
		b1.add("Poonam");
		b1.add("Nasira");
		b1.add("Vaibhavi");
		b1.add("Laxmi");
		
		//b1.delete(1);
		System.out.println(b1);
		ArrayList<Integer> a2=new<Integer> ArrayList();
		a2.add(20);
		a2.add(10);
		a2.add(15);
		a1.addAll(a2);
		System.out.println(a1);
		a1.addAll(1,a2);
		System.out.println(a1);
	}
	
}
