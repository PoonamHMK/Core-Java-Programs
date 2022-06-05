package com.edu;

@FunctionalInterface
interface Drawable{   //Functional interface a interface which has single abstract method
	void draw(); //Lambda expression can be applied to a functional interface
}

public class LambdaClassMain {
	
	public static void main(String[] args) {
		
		//using Lambda expression ->
		Drawable dob=()->{
			//body of the function
			System.out.println("draw method body");
		};
		dob.draw();
	
		//Threa class Runnable interface
		
		Runnable rob=()->{
			System.out.println("Run method is called");
		};
		Thread tob=new Thread(rob);
		
		tob.start();
		}
	}


