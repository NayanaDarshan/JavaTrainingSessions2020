package TestCode;

public class fibonacciseriesTest {

	public static void main(String[] args) {
		int num=20;
		
		int a =0;
		
		int b=1;
		
		int c=1;
		System.out.println(a);
		
		for(int i =0; i< num; i++) {
		
			a=b;
			b=c;
			c= a+b;
			System.out.println(a + "");
					
		}

	}

}
