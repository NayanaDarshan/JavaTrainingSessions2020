package Inheritance;

public class BMW extends Car{

	public static void main(String[] args) {
		/*
		 * BMW b = new BMW(); b.start(); b.stop(); engine(); b.refueling();
		 */
		
		 Car c1=new BMW();
		 c1.start();
		 c1.stop();
		 c1.refueling();
		 
		 
		 
		

	}

	 public void start() {
    	System.out.println("The start class from BMW");
    }
     
	
	 public void stop() {
		 System.out.println("The stop class from BMW");
	 }
	 
	 public static void engine() {
        System.out.println("The engine of BMW");		 
	 }
}
