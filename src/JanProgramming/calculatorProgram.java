package JanProgramming;

import java.util.Scanner;

public class calculatorProgram {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter the operator");
		
		String operator= scn.next();
		
		int num1= 90;
		
		int num2=85;

		switch(operator) {
		
		case "+" : System.out.println("Sum===>" + (num1+num2));
		           break;
		
		case "-": System.out.println("Subtraction==>" + (num1-num2));
		          break;
		
		case "*": System.out.println("Multiplication===>" +(num1*num2));
		          break;
		default:
			System.out.println("Please enter valid operator");
			break;
		}
	}

}
