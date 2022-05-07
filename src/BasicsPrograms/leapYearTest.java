package BasicsPrograms;

public class leapYearTest {

	public static void main(String[] args) {
		int year=2000;
		
		if(year%4==0 && year%100==0 && year%400==0) {
			System.out.println("The year is leap");
		}
		else {
			System.out.println("The given year is not leap");
		}
	}

}
