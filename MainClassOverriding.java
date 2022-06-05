//Overriding in java
package firstpackage;


class Shape{
	void area() {
		System.out.println("Area of Shape class");
	}
}
class Square extends Shape{
	
   void area() {
		System.out.println("Area of Square class");
	}
}

class Reactangle extends Shape{
     void area() {
		System.out.println("Area of Reactangle class");
	}
	
}
public class MainClassOverriding {

	public static void main(String[] args) {
		Reactangle rob=new Reactangle();
		rob.area();
		Square sob=new Square();
		sob.area();
		
		Shape shob;
		shob=new Reactangle();
		shob.area();//call Reactangle Area
        shob=new Square();
        shob.area();//call Square area
	}

}


		
	