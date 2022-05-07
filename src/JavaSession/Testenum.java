package JavaSession;

import java.util.Scanner;

public class Testenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test var = test.HIGH;

		System.out.println(var);

		for (test vartest : test.values()) {
			System.out.println(vartest);
		}
		
		System.out.println("Please enter the name");
		Scanner scn = new Scanner(System.in);
		
		double d =scn.nextInt();
		
		System.out.println(d);
		
		
	}

	enum test {
		HIGH, LOW, MEDIUM;
	}
}
