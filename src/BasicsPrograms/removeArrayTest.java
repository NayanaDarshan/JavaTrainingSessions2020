package BasicsPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class removeArrayTest {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Red", "pink", "Green", "yellow"));
		
	
		ArrayList<String> ar1= new ArrayList<String>(Arrays.asList("Red", "pink"));
		
		ar.removeAll(ar1);
		
		for(String removeddata : ar) {
			System.out.println(ar);
		}
		

	}

}
