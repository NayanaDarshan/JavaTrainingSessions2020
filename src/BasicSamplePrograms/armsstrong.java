package BasicSamplePrograms;

import java.util.Arrays;
import java.util.Collections;

public class armsstrong {

	public static void main(String[] args) {
	
		String str1= "care";
		
		String str2="race";
		
		if(str1.length()==str2.length()) {
			
			char[] ch1=str1.toCharArray();
			char[] ch2= str2.toCharArray();
			
			Arrays.sort(ch1);
			
			Arrays.sort(ch2);
			
			if(Arrays.equals(ch1, ch2)) {
				System.out.println("The given string is Armsstrong");
			}
			else {
				System.out.println("The given string is NOT Armsstrong");
			}
			
			
			
		}
		else {
			System.out.println("The given string cannot be computed in armsstrong string");
		}

	}

}
