package pack.com;

interface MyInterface{
	int k=20;
public	void display();  //abstract public void display()
	void add();
}
class MyClass implements MyInterface{

	@Override
	public void display() {
		System.out.println("Display method");
		
	}

	@Override
	public void add() {
		System.out.println("Add method");
		
	}
}
public class MainClassInterface {

	public static void main(String[] args) {
		//
       MyClass ob=new MyClass();
       ob.add();
       ob.display();
	}

}

