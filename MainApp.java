//implementing thread using Annonymous class
public class MainApp {

	public static void main(String[] args) {
		Thread ob=new Thread() {
			public void run() {
				System.out.println("Run Method");
			}
		};
		ob.start();

	
//or


      new Thread() {
    	  public void run() {
    		  System.out.println("Run method");
    		  
    	  }
      }.start();
    	  
      }
}