package pkg.string;


public class StringDemo {

	public static void main(String[] args) {
		String s= "Edubridge India";
		int v=0;
		int c=0;
		
		String s1=s.toLowerCase();
		
		     for(int i=0; i<s1.length(); i++) {
		    	char ch=s.charAt(i);
		    	if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u') 
		    		{
		    			v++;
		    		}
		    		else if(ch!=' ')
		    		{
		    			c++;
		    		}
		    	
		    }
               System.out.println(" Vowel= "+v);
               System.out.println("Consonents= "+c);
               
	}
	

	}
