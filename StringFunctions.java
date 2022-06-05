package pkg.string;

public class StringFunctions {

	public static void main(String[] args) {
		String s= "Eubridge India";
		
		//substring
		System.out.println(s.substring(6));
        System.out.println(s.substring(4,10));
        
        //indexOf position of character from left to right
        System.out.println(s.indexOf('i'));
        
        //
        System.out.println(s.lastIndexOf('i'));
	}

}
