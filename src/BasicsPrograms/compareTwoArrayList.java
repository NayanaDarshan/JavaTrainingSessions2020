package BasicsPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class compareTwoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Red", "Pink","Yellow"));
		
		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("Red", "Pink", "Green", "Yellow"));
		
		ArrayList<String> ar2 = new ArrayList<String>();
		
		for(String newlist : ar) {
			
			ar2.add(ar1.contains(newlist)? "yes": "no");
			 System.out.println(newlist);
			
		}
	   

	}

}
