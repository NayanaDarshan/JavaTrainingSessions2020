package JavaSession;

import java.util.Scanner;

public class TFunctionsMethods {

	public static void main(String[] args) {

		TFunctionsMethods obj = new TFunctionsMethods();
		obj.sumMethod(120, 80);
		obj.multipleMethod(23, 23);
		obj.areaCircumference(2);
		
	}

	// 1.Write a program to print the sum of two numbers entered by user by defining
	// your own method.

	public void sumMethod(int a, int b) {

		int sum = a + b;

		System.out.println("The sum of two numbers are===>" + sum);
	}

	// 2. Define a method that returns the product of two numbers entered by user.

	public void multipleMethod(int m, int n) {

		int multiply = m * n;

		System.out.println("The result of product of two numbers===>" + multiply);
	}
	//3. Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.

	public void areaCircumference(int r) {
		double pie = 3.14;
		double Circumference = 2 * pie * r;
		double area = pie * r * r;

		System.out.println("The circumference of the circle is ===>" + Circumference);
		System.out.println("The area of circle===>" + area);
	}

}
