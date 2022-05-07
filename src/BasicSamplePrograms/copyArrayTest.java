package BasicSamplePrograms;

public class copyArrayTest {

	public static void main(String[] args) {
		int [] num= {10,20, 30, 40, 50, 60};
		
		int[] positivenum= num;
		
		for(int numbers :positivenum) {
			
			System.out.println(numbers);
		}

	}

}
