package firstpackage;

 class Addition{
	static int i;
	static int k;
	static int s;
	static {
		//static block is used to initialize static data
        i=10;
		k=20;
	}
	static void add() {
		//static method can access only static data
	    //static method belongs to class
     	s=i+k;
		System.out.println("sum= "+s);
	}
}

 class StaticMethodMain {

	public static void main(String[] args) {
		int a=10,b=2, c=0;
		System.out.println("Before division");
		c=a/b;
		System.out.println("After division");
		
		

	}

}
