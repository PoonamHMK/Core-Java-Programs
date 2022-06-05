package pack2;

public class Pattern {

	
		public static void main(String[] args) {
			int n=5;
			for(int i=1;i<=n;i++) {
				for(int j=n;j>=i;j--) {
					//System.out.print(j+" ");
					int z=j%2;
					System.out.print(z+" ");
				}
				System.out.println("\n");
			}

		}

	}


