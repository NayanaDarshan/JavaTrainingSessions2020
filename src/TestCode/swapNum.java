package TestCode;

import java.util.Scanner;

public class swapNum {

	public static void main(String[] args) {
		System.out.println("please enter the number");
		Scanner scn = new Scanner(System.in);
		
		int x =scn.nextInt();
		
		int y = scn.nextInt();
		
		/*
		 * int temp=x; x=y; y=temp;
		 */
		
		x=x+y;
		System.out.println(x);
		y=x-y;
		System.out.println(y);
		x=x-y;
		System.out.println(x);
		
		System.out.println(x);
		System.out.println(y);
				

	}

}
