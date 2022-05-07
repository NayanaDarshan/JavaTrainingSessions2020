package JanProgramming;

public class reverseNum {

	public static void main(String[] args) {
		int number=678789;
		
		int reversed=0;
		
		while(number!=0) {
			int digit = number%10;
			
			reversed= reversed*10+digit;
			
			number = number/10;
		}
		System.out.println(reversed);

	}

}
