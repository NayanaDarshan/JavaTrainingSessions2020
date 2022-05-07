package BasicsPrograms;

public class NewStringObjectWithContentsofCharArrayTest {

	public static void main(String[] args) {
	
		char ch[] = new char[] {'1','A','B','C'};
		
		String str = String.copyValueOf(ch);
		
		System.out.println(str);
		
	      
	}

}
