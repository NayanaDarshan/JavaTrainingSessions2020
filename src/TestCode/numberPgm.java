package TestCode;

import java.util.Scanner;

public class numberPgm {

	public static void main(String[] args) {

		System.out.println("Please enter the number");
		Scanner scn = new Scanner(System.in);

		int number = scn.nextInt();

		while (number > 0) {
			if (number % 2 == 0) {
				System.out.println("1");

			} else {
				System.out.println("0");
			}
			break;
		}

		System.out.println("Please enter correct number");
	}

}
