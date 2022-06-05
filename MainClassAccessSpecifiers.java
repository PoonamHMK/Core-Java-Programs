package firstpackage;
class MyFirstClass{
	private int pri; //private
	public int pubj; //public
	protected int protk; //protected
	int dfm; //default
	
	//with in package
	//private is only within the class
	//default public are like public 
	//all the classes can access with ref to object
	//protected inherited can access directly
	//other class can access with ref to object;
	void myFirstClassDisplay() {
		//private is visible only with class
		System.out.println("private can be accessed "+pri);
		System.out.println("public can be accessed "+pubj);
		System.out.println("protected can be accessed "+protk);
		System.out.println("default can be accessed "+dfm);
		
	}
}
	class IndependentClass{
		void display() {
			MyFirstClass mob=new MyFirstClass(); //having an object is called has-A relation
		
			//System.out.println("private can be accessed "+mob.pri); //another class private is hidden
			System.out.println("public can be accessed "+mob.pubj);
			System.out.println("protected can be accessed "+mob.protk);
			System.out.println("default can be accessed "+mob.dfm);
		}
	}

	class MyExtendedClass extends MyFirstClass{ //extending is called IS-A relation
		void extendedDisplay() {
			//MyFirstClass mob=new MyFirstClass();
			//no need object creation 
			//public ,default and protected directly inherited
			//System.out.println("private can be accessed "+mob.pri); //another calss private is hidden
			System.out.println("public can be accessed "+pubj);
			System.out.println("protected can be accessed "+protk);
			System.out.println("default can be accessed "+dfm);
		}
	}
	
   public class MainClassAccessSpecifiers {
        public static void main(String[] args) {
        	IndependentClass ob=new IndependentClass();
    		ob.display();
    		MyExtendedClass ob1=new MyExtendedClass();
    		ob1.extendedDisplay();
    	}

    }