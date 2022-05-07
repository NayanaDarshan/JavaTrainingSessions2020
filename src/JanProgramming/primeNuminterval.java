package JanProgramming;

public class primeNuminterval {

	public static void main(String[] args) {
	
		int low=3;
		
		int high=10;
		
		while(low<high) {
			checkPrime(low);
			
			low++;
		}
	}

	public static void checkPrime(int num) {
		
		boolean isPrime= true;
		
		for (int i=2; i<=num/2; i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
			
		}
		if(isPrime) {
			System.out.println("The number is  PRIME===>" +num );
		}
		else {
			System.out.println("The number is NOT PRIME===>" +num);
		}
	}
}
