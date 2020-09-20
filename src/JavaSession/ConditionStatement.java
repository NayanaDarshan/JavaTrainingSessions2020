package JavaSession;

import java.util.Scanner;

public class ConditionStatement {

	public static void main(String[] args) {

		System.out.println("********************************************************************************");
//Conditional Operators:
//1. Take three numbers from the user and print the greatest number. 
//Test Data
//Input the 1st number: 25 
//Input the 2nd number: 78 
//Input the 3rd number: 87
//Expected Output :
//The greatest: 87
    
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter the num1");
		short num1 = scan.nextShort();

		System.out.println("Please enter the num2");
		short num2 = scan.nextShort();

		System.out.println("Please enter the num3");
		short num3 = scan.nextShort();

		if (num1 > num2 && num1 > num3) {
			System.out.println("The greatest:" + num1);
		}

		else if (num2 > num3) {
			System.out.println("The greatest:" + num2);
		}

		else {
			System.out.println("The greatest:" + num3);
		}

System.out.println("*********************************************************************************");
	

//2. Write a Java program to test a number is positive or negative.

		// Test Data
		// Input number: 35 -- positive number
		// Input number: -11 -- negative number

		int num = -89;
		if (num >= 0) {
			System.out.println("Input number: " + num + " -- Positive number");
		} else {
			System.out.println("Input number: " + num + " -- negative number");
		}

		System.out.println("*********************************************************************************");

	}
}
/*
 * int a = 18;
 * 
 * if (a < 10) { System.out.println("The number is within 1-10 range:" + a); }
 * 
 * if (a >= 10) { System.out.println("The number is outside 1-10 range:" + a); }
 * 
 * String name = "Nayana";
 * 
 * if (name.equals("Nayana")) { System.out.println("The names are equal"); }
 * 
 * System.out.println(
 * "***********************************************************");
 * 
 * int b = 90;
 * 
 * if (b == 20) { System.out.println("The number is equal to value :" + " " +
 * b); }
 * 
 * else if (b >= 30 && b <= 40) {
 * System.out.println("The number is greater than value of 20===>" + b); }
 * 
 * else { System.out.println("The number not falls in the range and value is:" +
 * b); }
 * 
 * }
 * 
 * }
 */
// if statement always applicable for conditions on which returns boolean results( either true/false)

// if condition-> execute the statements within the  if block when condition is satisfied.

// if if condition-> nested if -> check the each if statement one by one and based on condition stasification. It will execute the code

//if elseif else if else-> using elseif statement on statisfying the condition it execute the code within the block and won't check for further elseif statments

//                      --> else part will be executed when none of the condition satisifies in elseif block

//if else statements-> if condition is stasified then execute if block code. If not satisfied then else part will be executed

//&& Short circuit operator or AND operator->when both the condition  exists in left hand and right hand side stasifies( i,e either true/false) execute the block of code

//|| operator -> OR operator will be executed when one of the condition is satisfied  either left or right operand.