package pack.poonam2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class ArrayListIterate7 {

	public static void main(String[] args) {
		ArrayList<String> ob=new ArrayList<>();
      //  adding elements to the end
         ob.add("First");
         ob.add("Second");
         ob.add("Third");
         System.out.println(ob);
      //   adding element at specified index
         ob.add(2, "Random");
         System.out.println(ob);
       //  getting elements by index
         System.out.println("Elements at index 3 is: "+ob.get(3));
         System.out.println(" Is this vector empty? "+ob.isEmpty());
         
	  // Iterate element using iterator
         Iterator it=ob.iterator();
         while(it.hasNext()) {
        	 System.out.println(it.next());
         }
        // Iterate ArrayList both forword and reverse direction
         ListIterator lit=ob.listIterator();
         System.out.println("ArrayList in forword direction");
         while(lit.hasNext()) {
        	 System.out.println(lit.next());
        }
         System.out.println("ArrayList elements in backword direction");
         while(lit.hasPrevious()) {
        	 System.out.println(lit.previous());
	}
	

}
}
 