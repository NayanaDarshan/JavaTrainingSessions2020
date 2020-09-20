package Inheritance;

public class Car {
	
	public static void main( String[] args) {
		Car obj = new Car();
		obj.start();
		obj.stop();
		obj.refueling();
		BMW.engine();
		
		 Audi obja =(Audi) new Car();
		 
		 obja.outWindow();
			
	}
	
	public void start() {
		System.out.println("The start from Car class");
	}
	
	public void stop() {
		System.out.println("The stop from Car class");
	}
	
	public void refueling() {
		System.out.println("The refuel petrol from Car class");
	}

	

}
