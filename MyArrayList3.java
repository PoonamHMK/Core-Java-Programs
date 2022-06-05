package pack.poonam2;

import java.util.ArrayList;

public class MyArrayList3 {

	public static void main(String[] args) {
		ArrayList lst=new ArrayList();   //we can insert all type of data
		 lst.add(50);
         lst.add(56.32f);
         lst.add("world");
         lst.add('c');
        // lst.add(2,65);
         lst.remove(2);
           System.out.println(lst);
}
}
