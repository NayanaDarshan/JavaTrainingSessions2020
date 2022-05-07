package BasicSamplePrograms;

public class primeNumberInRange {

	public static void main(String[] args) {
		
		int low=20;
		int high=50;
		
		while(low<high) {
			if(checkPrimeNumTest(low)) {
				
				System.out.println(low);
				++low;
			}
			
			
		}
	
	}

	public static boolean checkPrimeNumTest(int number) {
		
		boolean flag= true;
		
		for( int i=2; i<=number/2; ++i) {
			if(number%i==0) {
				
				 flag=false;
				 break;
		}
		
		}
		return flag;

	}
}
