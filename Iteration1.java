package pack.poonam2;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteration1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ob=new ArrayList<>();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
        //to check array list is empty or not
        
        System.out.println(ob.isEmpty()); // returns true or false
        ob.add(2,100);
        System.out.println(ob);
        System.out.println(ob.subList(1,3));
        
	}

}
