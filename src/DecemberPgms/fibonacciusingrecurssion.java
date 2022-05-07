package DecemberPgms;

public class fibonacciusingrecurssion {

	static int n = 6;

	public static void main(String[] args) {

		fiborecursion(6);

	}

	public static void fiborecursion(int n) {

		int firstnum = 0;
		int secondnum = 1;

		for (int i = 1; i <= n; i++) {
			System.out.println(firstnum);
			int nextterm = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextterm;

		}

	}

}
