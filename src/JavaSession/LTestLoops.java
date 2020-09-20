package JavaSession;

public class LTestLoops {

	public static void main(String[] args) {
		/*
		 * 1. WAP to print following output: I am Batman
		 * 
		 * I am Batman
		 * 
		 * I am Batman
		 * 
		 * I am Batman
		 * 
		 * I am Batman
		 * 
		 */

		for (int p = 1; p <= 4; p++) {

			System.out.println("I am Batman");
		}

		System.out.println("*****************************************************");
		/*
		 * 2. WAP to print following output: I am Batman 1
		 * 
		 * I am Batman 2
		 * 
		 * I am Batman 3
		 * 
		 * I am Batman 4
		 * 
		 * I am Batman 5
		 * 
		 * I am Batman 6
		 * 
		 * I am Batman 7
		 * 
		 * I am Batman 8
		 * 
		 * I am Batman 9
		 */

		for (int p = 1; p <= 9; p++) {

			System.out.println("I am Batman" + " " + p);
		}

		System.out.println("For Loop*****************************************************");

		// 3. WAP to print 10 to 1 using for, while and do-while loop

		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("while loop*****************************************************");
		int m = 10;

		while (m >= 1) {
			System.out.println(m);
			m--;
		}
		System.out.println("do while loop*****************************************************");

		int l = 10;
		do {

			// System.out.println("Priniting the values in reverse order");
			System.out.println(l);
			l--;

		} while (l >= 1);

		System.out.println("*****************************************************");
		// 4. Write a program in Java to print "Hello World" ten times using while loop

		int a = 1;

		while (a <= 10) {
			System.out.println("Hello world");
			a = a + 1;
		}
		System.out.println("*****************************************************");
		// 5. Write a program in Java to print 1 to 10 using while loop but quit if
		// multiple of 7 is encountered

		int b = 1;

		while (b <= 10) {

			if (b % 7 == 0) {

				System.out.println(" The number is multiple of 7 is encountered===>" + b);
				break;
			}

			System.out.println(b);
			b = b + 1;
		}

	}

}
