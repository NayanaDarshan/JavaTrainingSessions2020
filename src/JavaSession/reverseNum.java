package JavaSession;

public class reverseNum {

	public static void main(String[] args) {
		int num = 654321;

		int rev = 0;

		while (num != 0) {
			
			int n = num%10;
			rev= rev*10+n;
			num= num/10;
		

		}
		
		System.out.println(rev);
	}
}