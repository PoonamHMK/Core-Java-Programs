package Array.pack2;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();
        list.add("Hi");
        list.add("Hello");
        list.add("Shubham");
        list.add("Vandana");
        list.add("Ujjwala");
        
        System.out.println(list.contains("Poonam"));
        list.add(2, "Poonam");
        System.out.println("Get value in 3rd index " +list.get(2));
        
        System.out.println(list);
        
        //Integer ArrayList
        ArrayList<Integer> iob=new ArrayList<Integer>();
        iob.add(12);
        iob.add(25);
        iob.add(35);
        iob.add(30);
        iob.add(80);
        
       System.out.println("Arry list og integer is " +iob);
       
       //float ArrayListfob
       ArrayList<Float> fob=new ArrayList<Float>();
       fob.add(2.3f);
       fob.add(4.5f);
       fob.add(8.5f);;
       fob.add(7.5f);
       fob.add(9.2f);
       
       System.out.println("Array list of float is "+fob);
       fob.clear();
       
       
       
	}

}
