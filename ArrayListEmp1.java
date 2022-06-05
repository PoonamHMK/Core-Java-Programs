package pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class MyEmployee{
	int Eid;
	String Ename;
	Float Esal;
	public MyEmployee(int eid, String ename, Float esal) {
		super();
		Eid = eid;
		Ename = ename;
		Esal = esal;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public Float getEsal() {
		return Esal;
	}
	public void setEsal(Float esal) {
		Esal = esal;
	}
	
}
class EmployeeIdCompare implements Comparator<MyEmployee>{

	@Override
	public int compare(MyEmployee o1, MyEmployee o2) {
		
		return o1.Eid-o2.Eid;
	}
}
class EmployeeNameCompare implements Comparator<MyEmployee>{
	@Override
	public int compare(MyEmployee o1, MyEmployee o2) {
		return o1.getEname().compareTo(o2.getEname());
	}
}
class EmployeeSalaryCompare implements Comparator<MyEmployee>{

	@Override
	public int compare(MyEmployee o1, MyEmployee o2) {
		return (int)(o1.Esal-o2.Esal);
	}
	
}
	

public class ArrayListEmp1 {

	public static void main(String[] args) {
		ArrayList<MyEmployee> ob=new ArrayList<MyEmployee>();
		MyEmployee eob1=new MyEmployee(111, "Dhwani", 20000f);
		MyEmployee eob2=new MyEmployee(333, "Antara", 10000f);
		MyEmployee eob3=new MyEmployee(222, "Sanjana", 30000f);
		ob.add(eob1);
		ob.add(eob2);
		ob.add(eob3);
		
		System.out.println("Sorting based on the Id :");
		
		Collections.sort(ob, new EmployeeIdCompare() );	
		
		Iterator<MyEmployee> eit=ob.iterator();
		while (eit.hasNext()) {
			MyEmployee et=eit.next();
		System.out.println("Id= "+et.getEid()+" Name= "+et.getEname()+" Salary= "+et.getEsal());
	}
		
		ArrayList<MyEmployee> ob1= new ArrayList<MyEmployee>();
		MyEmployee eob4= new MyEmployee(101, "Yashoda", 40000f);
		MyEmployee eob5= new MyEmployee(103, "Pooanm", 50000f);
		MyEmployee eob6= new MyEmployee(102, "Dipika",45000f);
		ob1.add(eob4);
		ob1.add(eob5);
		ob1.add(eob6);
		
		 System.out.println("Sortin based on the Name :");
		 
		 Collections.sort(ob1, new EmployeeNameCompare());
		 
		 Iterator<MyEmployee> eit1=ob1.iterator();
		 while (eit1.hasNext()) {
			 MyEmployee et1=eit1.next();
		 System.out.println("Id= "+et1.getEid()+" Name= "+et1.getEname()+" Salary= "+et1.getEsal());
		 }
		 
		 ArrayList<MyEmployee> ob2= new ArrayList<MyEmployee>();
		 MyEmployee eob7= new MyEmployee(245, "Chitara", 50000f);
		 MyEmployee eob8= new MyEmployee(445, "Mesga" , 45000f);
		 MyEmployee eob9= new MyEmployee(345, "Amar", 80000f);
		 ob2.add(eob7);
		 ob2.add(eob8);
		 ob2.add(eob9);
		 
		 System.out.println("Sorting based on Salary :");
		 
		 Collections.sort(ob2, new EmployeeSalaryCompare());
		 
		 Iterator<MyEmployee> eit2=ob2.iterator();
		 while (eit2.hasNext()) {
			 MyEmployee et2=eit2.next();
		System.out.println("Id= "+et2.getEid()+" Name= "+et2.getEname()+" Salary= "+et2.getEsal());
		 }
		 
		 
	}
}


	
	
	
	




