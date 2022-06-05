package Array.pack2;

public class MainArray2 {

	public static void main(String[] args) {
		//find maximum of array element
		int ar[]=new int[5];
				int max=ar[0];
				for(int i=1;i<ar.length;i++) {
					if(ar[i]>max) {
						max=ar[i];
					}
				}
				System.out.println("Maximum of array element is"+max);

				//find minimum of array element
						int min=ar[0];
						for(int i=1;i<ar.length;i++) {
							if(ar[i]<min) {
								min=ar[i];
							}
						}
						System.out.println("minimum of array element is"+min);

	}

}
