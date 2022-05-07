package JavaSession;

import java.util.Scanner;

public class multiplicationPgm {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter number");
		int number= scn.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println("The multiplied number results is===>" +number+"*"+i+"===>"+number*i);
		}
	}

}
