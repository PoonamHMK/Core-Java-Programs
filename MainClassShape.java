package firstpackage;

 abstract class Shape1{
     abstract void area();   //if method implementation is not there make
     void display() {
    	 System.out.println("Display inside abstract shape class");
     }
 }
 
 class square1 extends Shape1{
	    @Override
	   void area() {
		 System.out.println("Area of square");
   }
 }
 
 public class MainClassShape {

	public static void main(String[] args) {
		//Shape ob=new Shape();     //abstract class cannot have objects
             square1 ob=new square1();
             ob.area();
	}
}
