package BasicSamplePrograms;

import java.util.Scanner;

public class greatestNumbers {

	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter numbers");
		int number1 =scn.nextInt();
		int number2= scn.nextInt();
		int number3= scn.nextInt();
		
		if(number1>number2 && number1>number3) {
			
			System.out.println("Number1 is greatest" +number1);
			
		}
		else if(number2>number3 && number2>number1) {
			System.out.println("Number 2 is greatest" +number2);
		}

		else {
			System.out.println("Number 3 is greatest"  +number3);
		}
	}

}
