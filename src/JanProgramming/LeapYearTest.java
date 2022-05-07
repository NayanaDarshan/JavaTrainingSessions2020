package JanProgramming;

import java.util.Scanner;

public class LeapYearTest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("please enter the year");
		
		int year= scn.nextInt();
		boolean status = false;
		if(year%400==0 || year%4==0 || year%100==0) {
			status=true;

		}
		
		if(status==true) {
			System.out.println("The year is leap");
		}
		else {
			System.out.println("The year is NOT leap");
		}
	}
	
	

}
