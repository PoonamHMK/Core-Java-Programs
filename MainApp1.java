package pack2;

class Table{
 synchronized void print(int num) {
		for(int i=1; i<=10; i++) {	
			 System.out.println(num+"X"+i+"="+num*i); 
	    	  
		}
	}
}
public class MainApp1 {

	public static void main(String[] args) throws InterruptedException {
      Table t=new Table();
		Thread ob=new Thread() {
	  	    
	public void run() {
		t.print(2);
	}
};
		ob.start();

  
	    Thread ob1=new Thread() {
        
	public void run() {
		t.print(5);
	}
	 };
	 ob1.start();
	}
}
	 
	
  
       
    	 
      
       
  
	  
      
		

	


