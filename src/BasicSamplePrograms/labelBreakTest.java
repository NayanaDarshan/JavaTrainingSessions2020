package BasicSamplePrograms;

public class labelBreakTest {

	public static void main(String[] args) {
		first:		
		for(int i=1; i<=5; i++) {
			
			second:
			for(int j=1; j<=5; j++) {
				
				System.out.println(i+"===="+j);
				
				if(i==3) {
					System.out.println("break test");
					break first;
				}
			}
			
		}
	}

}
