package BasicsPrograms;

public class charArrayToStringTest {
	
	static String str = "Nayana";
	

	public static void main(String[] args) {
		char[] ch =toCovertStringArray(str);
		
		System.out.println(ch);
		
		System.out.println(toConvertString());

	}

	public static char[] toCovertStringArray(String str) {

		char[] ch = str.toCharArray();

		return ch;
	}

	public static String toConvertString() {
		
		char[] ch =toCovertStringArray(str);
		
		return String.valueOf(ch);
	}
}