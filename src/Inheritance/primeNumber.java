package Inheritance;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isPrimestatus =isPrime(17);
		
		System.out.println(isPrimestatus);
		
		if(isPrimestatus) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}
	}

	public static boolean isPrime(int num) {
		
		boolean status = true;
		
		if(num<=1) {
			return false;
		}
		else {
			for(int i=2; i< num/2; i++) {
				
				int r= num%i;
				
				if(r==0) {
					
					return false;

				}	
			}
		
		}
		return status;	
		
	}
}
