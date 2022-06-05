package pkg.string;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		String s="Hello";
		
		StringBuffer b=new StringBuffer(s);
		//StringBuffer ->Thread safe, methods are synchronised
		//StringBuilder ->not thread safe
		//insert,append,replace,delete,reverse
		//insert
		b.insert(2,  "India");
		System.out.println("After insert" +b);
		
		//append
		b.append("Hi");
		System.out.println("After append "+b);
		
		//reverse
		b.reverse();
		System.out.println("After reverse "+b);
		
		//replace
		b.replace(3, 4, "How are you?");
		System.out.println("After replace "+b);
		
		//delete
		b.delete(2, 5);
		System.out.println("After delete "+b);
		
		//particular character to delete
		b.deleteCharAt(5);

	}

}
