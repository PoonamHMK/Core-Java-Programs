package pack.poonam2;

import java.util.ArrayList;
import java.util.Iterator;


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
	
    public class MyArrayListStudent {

	public static void main(String[] args) {
	ArrayList<MyStudent> ob=new ArrayList<>();
	MyStudent sob1=new MyStudent(1,"Poonam",8976.45f );
	MyStudent sob2=new MyStudent(2,"Pratibha",8966.45f );
	MyStudent sob3=new MyStudent(3,"Pallavi",8266.45f );
	ob.add(sob1);
	ob.add(sob2);
	ob.add(sob3);
	//Fetch data from List
	Iterator<MyStudent> sit=ob.iterator();
	while(sit.hasNext()) {
	MyStudent st=sit.next();
	System.out.println(st.getName()+" "+st.getFees()+" "+st.getSid());
	}
    }
}

