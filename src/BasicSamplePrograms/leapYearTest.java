package BasicSamplePrograms;

public class leapYearTest {

	public static void main(String[] args) {
		
		System.out.println(leapYearTest(2021));

	}

	public static boolean leapYearTest(int year) {
		boolean status = false;

		if(year%4==0 || year%100==0 || year%400==0) {
			return status=true;
		}
		else {
			return status;
		}
	}
	

}