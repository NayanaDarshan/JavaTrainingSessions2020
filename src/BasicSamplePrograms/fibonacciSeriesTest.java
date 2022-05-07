package BasicSamplePrograms;

public class fibonacciSeriesTest {

	public static void main(String[] args) {

		int firstnum = 0;

		int secondnum = 1;
		
		

		for (int i = 1; i <= 10; i++) {
			
			System.out.println(firstnum);
			
			int nextterm= firstnum+secondnum;
			firstnum=secondnum;
			secondnum=nextterm;
			
		}
		
		
	}

}
