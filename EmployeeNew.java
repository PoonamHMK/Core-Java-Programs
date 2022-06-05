package pack.poonam3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;


class MyEmployee{
	int sid;
	String name;
	float fees;
	public MyEmployee(int sid, String name, float fees) {
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
class EmployeeIdCompare implements Comparator<MyEmployee>{
	@Override
	public int compare(MyEmployee o1, MyEmployee o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
	
public class EmployeeNew {

	public static void main(String[] args) {
		LinkedList<MyEmployee> ob=new LinkedList<>();
		MyEmployee sob1=new MyEmployee(111,"Poonam",8976.45f );
		MyEmployee sob2=new MyEmployee(222,"Pratibha",8966.45f );
		MyEmployee sob3=new MyEmployee(333,"Pallavi",8266.45f );
		ob.add(sob1);
		ob.add(sob2);
		ob.add(sob3);
		
		//Collection.sort(ob.new EmployeeIdCompare());
		//Fetch data from List
		Iterator<MyEmployee> sit=ob.iterator();
		while(sit.hasNext()) {
			MyEmployee st=sit.next();
		System.out.println(st.getSid()+" "+st.getName()+" "+st.getFees());
		}
	    }
	}




