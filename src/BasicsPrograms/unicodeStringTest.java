package BasicsPrograms;

public class unicodeStringTest {

	public static void main(String[] args) {

		String str = "Smira";

		System.out.println(str.codePointAt(1));

		try {
			System.out.println(str.codePointAt(5));

			throw new Exception("Nayana execption");

		} catch (Exception e) {
			System.out.println("execption caught");
			/*
			 * e.getMessage(); e.printStackTrace();
			 */

		}

		/*
		 * code point at specified text
		 * 
		 */
		
		System.out.println(str.codePointCount(1, 5));
	}

}
