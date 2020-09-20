package JavaSession;

public class MinMaxClass {

	public static void main(String[] args) {
		MinMaxClass obj1 = new MinMaxClass();

		obj1.maxNum(60, 30, 40);
		obj1.minNum(25, 20, 10);
		obj1.voteAge(85);
		obj1.oddeven(0);

	}
	// 4. Define two methods to print the maximum and the minimum number
	// respectively among three numbers entered by user.

	public void maxNum(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " The first number is greatest");

		} else if (num2 > num3) {

			System.out.println(num2 + " The second number is greatest");
		} else {
			System.out.println(num3 + " The third number is greatest");
		}

	}

	public void minNum(int num1, int num2, int num3) {

		if (num1 < num2 && num1 < num3) {
			System.out.println(num1 + " The first number is smallest");

		} else if (num2 < num3) {

			System.out.println(num2 + " The second number is smallest");
		} else {
			System.out.println(num3 + " The third number is smallest");
		}
	}

	// 6. A person is elligible to vote if his/her age is greater than or equal to
	// 18. Define a method to find out if he/she is elligible to vote

	public void voteAge(int age) {

		if (age <= 17) {

			System.out.println("The person age is " + age + " NOT eligble for voting");
		}

		else {
			System.out.println("The person age is " + age + " and eligble for voting");
		}
		
	}

	// 5. Define a program to find out whether a given number is even or odd.

	public void oddeven(int num) {
		if (num % 2 == 0) {
			System.out.println("The given number is even==>" + num);
		} else {
			System.out.println("The given number is odd===>" + num);
		}
	}
}
