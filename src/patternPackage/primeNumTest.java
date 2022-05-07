package patternPackage;

public class primeNumTest {

	public static void main(String[] args) {
	
		boolean status = isPrimeNumber(7);
		
		if( status==true) {
			System.out.println("The number is prime");
		}
		else
		{
			System.out.println("The number is not prime");
		}
	}
	
	public static boolean isPrimeNumber(int num) {
		
		if(num<=1) {
			return false;
		}
		
		for (int i =2; i<num; i++) {
			if(num%i ==0) {
				return false;
				
			}
		}
		return true;
	}

}
