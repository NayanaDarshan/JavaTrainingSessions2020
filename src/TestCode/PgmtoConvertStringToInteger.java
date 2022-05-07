package TestCode;

import java.util.Scanner;

public class PgmtoConvertStringToInteger {

	public static void main(String[] args) {
		
		System.out.println("Please enter the string");
		
		Scanner scn = new Scanner(System.in);
		
		String name =scn.nextLine();
		
		int name1= Integer.parseInt(name);
		
		System.out.println(name1+100);

	}

}
