package pack.poonam2;

import java.util.ArrayList;
import java.util.Iterator;


class Student{
	int sid;
	String name;
	float fees;
	public Student(int sid, String name, float fees) {
		super();
		this.sid = sid;
		this.name = name;
		this.fees = fees;
	}
}
    public class MyArrayList6 {

	public static void main(String[] args) {
	ArrayList<Student> ob=new ArrayList<>();
	Student sob1=new Student(101,"Poonam",  8976.45f );
	Student sob2=new Student(102,"Pratibha",8966.45f );
	Student sob3=new Student(103,"Pallavi", 8266.45f );
	ob.add(sob1);
	ob.add(sob2);
	ob.add(sob3);
	
	//Fetch data from List
	Iterator<Student> sit=ob.iterator();
	while(sit.hasNext()) {
	Student s=sit.next();
	System.out.println(s.sid +" "+s.name+" "+s.fees);
	}
    }
}




