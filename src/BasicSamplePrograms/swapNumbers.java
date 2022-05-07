package BasicSamplePrograms;

public class swapNumbers {

	public static void main(String[] args) {
		swapTwoNumbers(10, 20);
		
		swapWithoutTemp(10,20);
     
	}

	public static void swapTwoNumbers(int m, int n) {
		
		
		int temp=m;
		m=n;
		n=temp;
		
		System.out.println(m);

		System.out.println(n);
		
		
	}
	
	public static void swapWithoutTemp(int m, int n) {
		
	 m = m-n;//-10
	 n=m+n;//10
	 m=n-m;
	 
	 System.out.println(m);
	 System.out.println(n);
		
		
	}
}
