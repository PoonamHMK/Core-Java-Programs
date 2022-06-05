package poonam.com;

public class LargOf2no {

	public static void main(String[] args) {
		int i=9, k=2;
		int p;
		p=(i>k)?i:k;
		System.out.println(" Lagest of "+i+" and "+k+" is " +p);
		int s=(i<k)?i:k;
		System.out.println("Smallest of "+i+" and "+k+" is "+s);
		
		int m=9,n=7, l=4;
		int lar=(m>n && m>l)?m:(n>m && n>l)?n:l;
		System.out.println("Largest of "+m+" and "+n+" and "+l+" is "+lar);
		
		int w=8,x=7,y=5,z=2;
		int largest=(w>x && w>y && w>z)?w:(x>w && x>y && x>z)?x:(y>w && y>x && y>z)?y:z;
		System.out.println("Largest of "+w+" and "+x+" and "+y+" and "+z+" is "+largest);
		

	}

}
