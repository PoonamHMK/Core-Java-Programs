//Thread concept by implementing Runnable Interface
package edu.com;


class MyClass implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Inside run method "+Thread.currentThread());
	}
}

public class MainClassRunnable {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		Thread tob = new Thread(ob);
		tob.setName("t1");
		tob.start();
		
	}

}



