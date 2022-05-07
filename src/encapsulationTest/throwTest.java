package encapsulationTest;

public class throwTest {

	public static void main(String[] args) {
		int age=10;
		
		if(age<18) {
			
			try {
				System.out.println("age is 18");
				int result = age/0;
				throw new Exception (" Nayana number exception ");		
		
			}
			catch( Exception e) {
				System.out.println("exception handled");
			}
		}
		else {
			System.out.println("incorrect age");
		}
	}

}
