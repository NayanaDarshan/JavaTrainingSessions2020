package BasicsPrograms;

public class unicodeBeforeIndexTest {

	public static void main(String[] args) {
		String str= "Nayana";
		System.out.println(str.length());
		
		System.out.println(str.charAt(0));
		System.out.println(str.codePointBefore(1));

	}

}
