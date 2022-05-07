package BasicsPrograms;

public class countNumbersTest {

	public static void main(String[] args) {
		int number=12398;
		
		int count=0;
		while(number!=0) {
			number= number/10;
			count++;
		}
		
		System.out.println(count);
	}

}
