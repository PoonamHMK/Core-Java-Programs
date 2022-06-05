package pkg.string;

public class FindSum {

	public static void main(String[] args) {
		String n="poo88nam4";
		int sum=0;
		for(int i=0; i<n.length(); i++)
		{
			char ch=n.charAt(i);
			if(ch=='1'||ch=='2'||ch=='3'||ch=='4'||ch=='5'||ch=='6'||ch=='7'||ch=='8'||ch=='9'||ch=='0')
			{
				String s=Character.toString(ch);
				int out=Integer.parseInt(s);
				sum=sum+out;
			}
		}
				System.out.println(sum);
			}
		}

	


