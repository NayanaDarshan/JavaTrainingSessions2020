package JavaSession;

/*//9. Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
4! = 1*2*3*4 = 24
3! = 3*2*1 = 6
2! = 2*1 = 2
Also,
1! = 1
0! = 0*/

public class FactorialPgm {

	public static void main(String[] args) {
		FactorialPgm objfact = new FactorialPgm();
		objfact.factorial(5);

	}

	public int factorial(int num) {
		int result = 1;
		if (num == 0) {
			System.out.println("The factorial of given number " + num + " and result is===>" + num);
		} else {
			for (int i = 1; i <= num; i++) {
				result = result * i;

			}
			System.out.println("The factorial of given number " + num + " and result is===>" + result);
		}
		return num;
	}
}