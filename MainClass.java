//Single inheritance
package inheritancejava;

class A{    //super class
	int i;   //instance variable
	A(){    //constructor
		i=10;
		System.out.println("i=" +i);
		System.out.println("Constructor of parent class A");
		
	}
}
   class B extends A{  //sub class
	   int j;
	   B(){
		  j=30;
			System.out.println("j = " +j);

		  System.out.println("Constructor of parent class B");
	   }
	   void add() {
		   int s=i+j;
		   System.out.println("sum = "+s);
	   }
   }
   
   public class MainClass {
     public static void main(String[] args) {
    	 B ob=new B();  //object of sub class
    	 ob.add();
		

	}

}
