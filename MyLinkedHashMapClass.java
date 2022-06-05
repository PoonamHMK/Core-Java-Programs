package pack1;

import java.util.LinkedHashMap;

public class MyLinkedHashMapClass {

		public static void main(String[] args) {
			LinkedHashMap<Integer,String> hp=new LinkedHashMap<Integer,String>();
			hp.put(20, "Sanika");
			hp.put(10, "Hanika");
			hp.put(10, "Poonam");
			hp.put(40, "Radha");
			hp.put(50, "Antara");
	    System.out.println(hp);
	}

}
