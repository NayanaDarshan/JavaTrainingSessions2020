package BasicsPrograms;

public class compareStringSpecificCharactersequenceTest {

	public static void main(String[] args) {
	
		String str= "Smira is daughter of Nayana";
		
		String charSequence= "Smira is daughter of Nayana";
		
		System.out.println(str.contentEquals(charSequence));
	

	/*
	 * using string buffer
	 */
	
	String str3="Nayana is good";
	
	String str4 ="Nayana is good";
	
	StringBuffer str5 = new StringBuffer(str4);
	
	System.out.println(str3.contentEquals(str5));
	
	}
}
