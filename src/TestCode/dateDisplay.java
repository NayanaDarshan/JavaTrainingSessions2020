package TestCode;

import java.nio.charset.Charset;
import java.util.Scanner;

public class dateDisplay {

	public static void main(String[] args) {

		System.out.format("\n current date and time is: %tc%n\n", System.currentTimeMillis());

		System.out.println("Below are list of charset");

		for (String str : Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}
		int char1 = 'z';

		System.out.println("The ASCII value of Z===>" + char1);

		System.out.println("Please enter the number");

		Scanner scn = new Scanner(System.in);

		int num = scn.nextInt();

		System.out.println(num + "+" + num + num + "+" + num + num + num);

		System.out.printf("%d +%d%d +%d%d%d\n", num, num, num, num, num, num);

		
		//1 to 99.
		
		for(int i =1; i<=99; i++) {
			
			if(i%2!=0) {
				System.out.println("The odd number is ===>" +i);
			}
		}
	}

}
