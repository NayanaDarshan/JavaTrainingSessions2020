package BasicSamplePrograms;

public class fibonacciseries {

	static int nextnum;

	public static void main(String[] args) {

		int firstnum = 0;

		int secondnum = 1;

		for (int i = 1; i <= 10; i++) {

			System.out.println(firstnum);
			nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;

		}

	}

}
