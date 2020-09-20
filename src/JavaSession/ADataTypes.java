package JavaSession;

public class ADataTypes {

	public static void main(String[] args) {
		System.out.println("************************************************************************************");
// Data Types:
		// 1. Write a Java program to print 'Hello' on screen and then print your name
		// on a separate line.

		String str = "Hello";
		String Name = "Nayana";

		System.out.println(str);
		System.out.println(Name);
		System.out.println("************************************************************************************");
		// 2. Write a Java program to print the sum of two numbers.

		byte a = 74;
		byte b = 36;

		System.out.println("The sum of number===>" + (a + b));

		System.out.println("************************************************************************************");
// 3. Write a Java program to divide two numbers and print on the screen.
		// Test Data :
		// 50/3

		byte x = 50;
		byte y = 3;

		int result = x / y;

		System.out.println("The result of 50/3 is :" + result);
		System.out.println("************************************************************************************");
//4. Write a Java program to print the result of the following operations. Change your test data accordingly.
		// Test Data:
		// a. -5 + 8 * 6
		// b. (55+9) % 9
		// c. 20 + -3*5 / 8
		// d. 5 + 15 / 3 * 2 - 8 % 3

		// Expected Output :
		// 43
		// 1
		// 19
		// 13

		short m = -5;
		short n = 8;
		short o = 6;

		int result1 = m + n * o;
		System.out.println(result1);

		int x1 = 55;
		int y1 = 9;
		int z1 = 9;

		int result2 = (x1 + y1) % z1;
		System.out.println(result2);

		int result3 = 20 + -3 * 5 / 8;
		System.out.println(result3);

		int result4 = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println(result4);
		System.out.println(
				"********************************************************************************************");

//5. Write a Java program to compute the specified expressions and print the output. Go to the editor
//Test Data:
//((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) 
//Expected Output
//2.138888888888889

		double d = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
		System.out.println(d);

		System.out.println(
				"********************************************************************************************");
//6. Try to concat "Hello Selenium" with a character 't'.
		// 7. Create three int variables having values like : 100, 200, 3400. Add them
		// and concatenate and generate this output String :
		// "Your Total amount is. 3700".
		int p = 100;
		int q = 200;
		int r = 3400;

		System.out.println("Your Total amount is." + " " + (p + q + r));

System.out.println("*******************************************************************************************");
// 6. Try to concat "Hello Selenium" with a character 't'.

		String str1 = "Hello Selenium";
		char ch = 't';

		System.out.println(str1 + ch);
		
System.out.println("*******************************************************************************************");
		// 8. What should be the output for :
		byte b3 = 077;
		System.out.println(b3);

	}

}
