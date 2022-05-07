package BasicsPrograms;

import java.util.Arrays;
import java.util.Collections;

public class anaragmTest {

	public static void main(String[] args) {
		
		String str1= "Race";
		
		String str2= "smir";
		
		String str11= str1.toLowerCase();
		
		String str22=str2.toLowerCase();
		
		char[] set1 =str11.toCharArray();
		
		char[] set2 = str22.toCharArray();
		
	
		Arrays.sort(set1);
		
		Arrays.sort(set2);
		
		
		if( str11.length()==str22.length()) {
			
			boolean result= Arrays.equals(set1, set2);
			
			if(result) {
				System.out.println(str11 + " ==is anagram strings==" +str22);
			}
			else {
				System.out.println(str11 + "==is NOT anagram strings==" +str22);
			}
			
		
		}
		else {
			System.out.println(str11 + "==is NOT anagram strings===" +str22);
		}
	}


}
