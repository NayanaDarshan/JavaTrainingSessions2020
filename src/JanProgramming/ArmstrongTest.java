package JanProgramming;

public class ArmstrongTest {

	public static void main(String[] args) {
		int number=153;
		
		int originalNumber,  remainder;
		
		int result=0;
		
		originalNumber= number;
		
		while(originalNumber!=0) {
			
			remainder= originalNumber%10;
			
			result= (int) (result+Math.pow(remainder, 3));
			
			originalNumber= originalNumber/10;
				
		}
		
		if(number==result) {
			System.out.println("The given number is Armstrong number");
		}
		else {
			System.out.println("The number is not Armstrong number");
		}
	}

}
