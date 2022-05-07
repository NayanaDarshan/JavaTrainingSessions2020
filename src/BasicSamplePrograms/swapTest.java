package BasicSamplePrograms;

public class swapTest {

	public static void main(String[] args) {
		int m = 10;
		int n = 20;

		/*
		 * int temp;
		 * 
		 * temp = m; m = n; n = temp;
		 * 
		 * System.out.println(m); System.out.println(n);
		 */

		m = m - n;
		n = m + n;
		m = n - m;

		System.out.println(m);
		System.out.println(n);

		String str = "This12345Nayana979898Smira00000";

		System.out.println(str.replaceAll("[0-9]", ""));
		// System.out.println(str.replaceAll("\\d+", ""));

		String str5 = "Nayana";

		String str6 = null;
		try {

			System.out.println(str5.concat(str6));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
