package Javathis;

public class scooty  extends bike{

	public static void main(String[] args) {
		
	bike bobj=	new scooty();
	
	bobj.run();

	}

	public void run() {
		System.out.println("The child class scooty is running.....");
	}
}
