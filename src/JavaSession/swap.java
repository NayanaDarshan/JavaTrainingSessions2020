package JavaSession;

public class swap {

	public static void main(String[] args) {
		int m = 20;
		int n =30;
		
		/*
		 * int temp;
		 * 
		 * temp=m; m=n; n=temp;
		 * 
		 * System.out.println(m); System.out.println(n);
		 */
		
		m = m-n; //-10
		n= m+n;//20
		m=n-m;//

		System.out.println(m);
		System.out.println(n);
		
	}

}
