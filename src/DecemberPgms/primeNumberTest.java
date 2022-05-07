package DecemberPgms;

public class primeNumberTest {

	public static void main(String[] args) {
		int num=7;
		
		if( num>=0) {
			
			for(int i=2; i<=num; i++) {
				
				if(i%2==0) {
			
				System.out.println("The number is not prime" +i);
			}
			
			else {
				System.out.println("The number is prime"+ i);
			}
		}
	}

	}
}
