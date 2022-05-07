package BasicsPrograms;

public class lexographicTest {

	public static void main(String[] args) {
		/*
		 * Lexographically meaning-> The two strings with same length and same set ofcharacters at same position
		 */

		
		String str1= "Nayana";
		
		String str2= "Nayana";
		
		int result= str1.compareTo(str2);
		
		if( result<0) {
			System.out.println("The str1 is lesser than str2");
		}
		
		else if(result==0) {
			System.out.println("The str1 is equal to str2");
		}
		else if(result>0) {
			System.out.println("The str1 is greater than str2");
		}
	
	
	/*
	 * Lexographic comparison ignoring the cases
	 * 
	 */
	
	String str3= "Smira";
	
	String str4 = "smira";
	
	int result1= str3.compareToIgnoreCase(str4);
	
	if(result1<0) {
		System.out.println("The str1 is greater than str2");
	}
	
	else if(result1==0) {
		System.out.println("The str1 is equal to str2");
	}
	else if(result1>0) {
		System.out.println("The str1 is lesser than str2");
	}

	/*
	 * Concatenate-> Means Adding of two strings at the end
	 * 
	 * 
	 */
	
	System.out.println(str1.concat(str4));
	}

}