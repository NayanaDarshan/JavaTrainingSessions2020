package JanProgramming;

public class swapTest {

	public static void main(String[] args) {
		int m = 45;
		int n = 56;

		int temp;

		temp = m;
		m = n;
		n = temp;

		System.out.println(m);
		System.out.println(n);

		System.out.println("**********************************************");
		
		m= m-n;
		n=m+n;
		m=n-m;
		
		System.out.println(m);
		System.out.println(n);
				
	}

}
