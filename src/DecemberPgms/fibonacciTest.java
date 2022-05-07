package DecemberPgms;

public class fibonacciTest {

	public static void main(String[] args) {

		int num = 10;

		int m = 0;
		int n = 1;

		// 0,1,1,2,3,5

		for (int i = 1; i <= num; i++) {
			
			System.out.println(m);
	
			int nextnum=m+n;
             m=n;
             n=nextnum;
		}

		
	}

	
	
}
