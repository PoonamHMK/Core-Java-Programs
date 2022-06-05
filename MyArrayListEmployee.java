package pack.poonam2;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	int eid;
	String ename;
	float salary;
	String desg;
	public Employee(int eid, String ename, float salary, String desg) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.desg = desg;
		}
	public int getEid() {     // Generate getter and setter
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
}

public class MyArrayListEmployee {
	
       public static void main(String[] args) {
		ArrayList<Employee> eit=new ArrayList<>();
		Employee eob=new Employee(1,"Poonam",10000f,"MD");
		Employee eob1=new Employee(2,"Sanika",20000f,"Manager");
		Employee eob2=new Employee(3,"Hanika",30000f,"officer");	
		eit.add(eob);
		eit.add(eob1);
		eit.add(eob2);
	
		Iterator<Employee> it=eit.iterator();
		while(it.hasNext()) {
		Employee e=it.next();
		System.out.println(e.getEid() +" "+e.getEname() +" "+e.getSalary() +" "+e.getDesg());
		}
	}
}
