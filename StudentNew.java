package pack.poonam3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;


class MyStudent{
	int sid;
	String name;
	float fees;
	public MyStudent(int sid, String name, float fees) {
		super();
		this.sid = sid;
		this.name = name;
		this.fees = fees;
		
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	}
 class Student1IdCompare implements Comparator<MyStudent>{
	 @Override
		public int   compare(MyStudent o1, MyStudent o2) {
			
			return o1.sid-o2.sid;
		}
	 }
 class Student1NameCompare implements Comparator<MyStudent>{

	@Override
	public int compare(MyStudent o1, MyStudent o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	 
 }
 class Student1FeesCompare implements Comparator<MyStudent>{

	@Override
	public int compare(MyStudent o1, MyStudent o2) {
	
		return (int)(o1.fees-o2.fees); //Always it returns int
	}
	 
 }
 
	  public class StudentNew {

	public static void main(String[] args) {
	ArrayList<MyStudent> ob=new ArrayList<MyStudent>();
	MyStudent sob1=new MyStudent(2,"Poonam",  8800.45f );
	MyStudent sob2=new MyStudent(3,"Pratibha",8500.45f );
	MyStudent sob3=new MyStudent(1,"Pallavi", 8700.45f );
	ob.add(sob1);
	ob.add(sob2);
	ob.add(sob3);
	
	System.out.println("Sorting based on the Id:");
	
	Collections.sort(ob,new Student1IdCompare());
	//Fetch data from List
	Iterator<MyStudent> sit=ob.iterator();
	while(sit.hasNext()) {
	MyStudent st=sit.next();
	System.out.println("Name= "+st.getName()+" Fees "+st.getFees()+" sid "+st.getSid());
	}
	
	ArrayList<MyStudent> ob1=new ArrayList<MyStudent>();//(new Student1NameCompare());
	MyStudent sob4=new MyStudent(2,"Chetan",  8800.45f );
	MyStudent sob5=new MyStudent(2,"Bhakti",8500.45f );
	MyStudent sob6=new MyStudent(1,"Ayra", 8700.45f );
	ob1.add(sob4);
	ob1.add(sob5);
	ob1.add(sob6);
	
	System.out.println("Sorting based on the Name:");
	
	Collections.sort(ob1,new Student1NameCompare());

	Iterator<MyStudent> sit1=ob1.iterator();
	while(sit1.hasNext()) {
		MyStudent st1=sit1.next();
	System.out.println("Name= "+st1.getName()+" Fees= "+st1.getFees()+" sid= "+st1.getSid());
		
	}
	ArrayList<MyStudent> ob2=new ArrayList<MyStudent>();//new Student1FeesCompare());
	MyStudent sob7=new MyStudent(1,"Chetan",  8800.45f );
	MyStudent sob8=new MyStudent(2,"Bhakti",8500.45f );
	MyStudent sob9=new MyStudent(3,"Ayra", 8700.45f );
	ob1.add(sob4);
	ob1.add(sob5);
	ob1.add(sob6);
	
	System.out.println("Sorting based on the fees:");
	
	Collections.sort(ob2,new Student1FeesCompare());

	Iterator<MyStudent> sit2=ob2.iterator();
	while(sit2.hasNext()) {
		MyStudent st2=sit2.next();
	System.out.println("Name= "+st2.getName()+" Fees= "+st2.getFees()+" sid= "+st2.getSid());
	}
	
	

    }
	
    }

	



