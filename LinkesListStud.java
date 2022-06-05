package pack.poonam2;

import java.util.Iterator;
import java.util.LinkedList;


class YourStudent{
	int sid;
	String name;
	float fees;
	public YourStudent(int sid, String name, float fees) {
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
	
public class LinkesListStud {

	public static void main(String[] args) {
		LinkedList<YourStudent> ob=new LinkedList<>();
		YourStudent sob1=new YourStudent(111,"Poonam",8976.45f );
		YourStudent sob2=new YourStudent(222,"Pratibha",8966.45f );
		YourStudent sob3=new YourStudent(333,"Pallavi",8266.45f );
		ob.add(sob1);
		ob.add(sob2);
		ob.add(sob3);
		//Fetch data from List
		Iterator<YourStudent> sit=ob.iterator();
		while(sit.hasNext()) {
		YourStudent st=sit.next();
		System.out.println(st.getSid()+" "+st.getName()+" "+st.getFees());
		}
	    }
	}

	

	


