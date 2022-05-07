package JavaSession;

import java.util.Scanner;

public class printTest {

	public static void main(String[] args) {
		System.out.println("Hello\nNayana");
		
		//System.out.println("Nayana");
		
		Scanner scn = new Scanner(System.in);
		
		String fname =scn.next();
		
		Scanner scn1 = new Scanner(System.in);
		
		String lname =scn.next();
		
		System.out.println("Hello\n" +fname+ lname);

	}

}
