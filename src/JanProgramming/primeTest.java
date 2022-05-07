package JanProgramming;

public class primeTest {

	public static void main(String[] args) {
		
		boolean isPrime=false;
		
		int num=15;
		
		for (int i=1; i<num/2; i++) {
			if(i%2==0) {
				
				isPrime=true;
				
				break;
			}
			
		}
		
		if(!isPrime) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is NOT prime");
		}
	}

}
