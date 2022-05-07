package BasicSamplePrograms;

public class factorialTest {

	public static void main(String[] args) {
		
		int factorial=1;
		
		for(int i=1; i<=5; i++) {
			
			factorial = factorial*i;
		}

		System.out.println(factorial);
		
	int factorialnum=	recusrssiveTest(4);
	
	System.out.println(factorialnum);
	
	System.out.println(recusrssiveTest(4));
		
	}
	
	
	public static int recusrssiveTest(int number) {
		
		if(number!=0) {
			return number*recusrssiveTest(number-1);
		}
		else {
			return 1;
		
		}
		
	}


}