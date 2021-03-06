package pack.poonam3;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class StudentTreeSet{
	int sid;
	int marks;
	String name;
	public StudentTreeSet(int sid, int marks, String name) {
		super();
		this.sid = sid;
		this.marks = marks;
		this.name = name;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
//TreeSet implement comparator interface

class StudentMarksCompare implements Comparator<StudentTreeSet>{

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		
		return o1.marks-o2.marks;
	}
}
class StudentNameCompare implements Comparator<StudentTreeSet>{

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
}
class StudentIdCompare implements Comparator<StudentTreeSet>{

	@Override
	public int compare(StudentTreeSet o1, StudentTreeSet o2) {
		
		return o1.sid-o2.sid;
	}
}

public class TreeSetStudentMain {

	public static void main(String[] args) {
		TreeSet<StudentTreeSet> ob=new TreeSet<StudentTreeSet>(new StudentMarksCompare() );
		StudentTreeSet tob1=new StudentTreeSet(1, 540, "Poonam");
		StudentTreeSet tob2=new StudentTreeSet(2, 512, "Shruti");
		StudentTreeSet tob3=new StudentTreeSet(3, 500, "Ekta");
		ob.add(tob1);
		ob.add(tob2);
		ob.add(tob3);
		
		System.out.println("Sorting based on the Marks");
		
		Iterator<StudentTreeSet> it=ob.iterator();
		while (it.hasNext()) {
			StudentTreeSet sob=it.next();
			System.out.println("sid= "+sob.getSid()+" name= "+sob.getName()+" marks"+sob.getMarks());
		}
		TreeSet<StudentTreeSet> ob1=new TreeSet<StudentTreeSet>(new StudentNameCompare());
		StudentTreeSet tob4=new StudentTreeSet(1, 600, "Sanika");
		StudentTreeSet tob5=new StudentTreeSet(2, 400, "Haniak");
		StudentTreeSet tob6=new StudentTreeSet(3, 355,"Poonam");
		ob1.add(tob4);
		ob1.add(tob5);
		ob1.add(tob6);
		
		 System.out.println("Sorting Based on the Name");
		 
		Iterator<StudentTreeSet> it1=ob1.iterator();
		while(it1.hasNext()) {
			StudentTreeSet sob1=it1.next();
			System.out.println("sid= "+sob1.getSid()+" name= "+sob1.getName()+" marks= "+sob1.getMarks());
		}
		TreeSet<StudentTreeSet> ob2=new TreeSet<StudentTreeSet>(new StudentIdCompare());
		StudentTreeSet tob7=new StudentTreeSet(3, 455, "Samiksha");
		StudentTreeSet tob8=new StudentTreeSet(2, 521, "Aditya");
		StudentTreeSet tob9=new StudentTreeSet(1, 655, "Vikram");
		ob2.add(tob7);
		ob2.add(tob8);
		ob2.add(tob9);
		
		System.out.println("Sorting based on the id");
		
		Iterator<StudentTreeSet> it2=ob2.iterator();
		while(it2.hasNext()) {
		StudentTreeSet sob2=it2.next();
		System.out.println("sid= "+sob2.getSid()+" name= "+sob2.getName()+" marks= "+sob2.getMarks());

	}

}
}


