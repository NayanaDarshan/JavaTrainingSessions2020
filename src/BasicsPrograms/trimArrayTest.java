package BasicsPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class trimArrayTest {

	public static void main(String[] args) {
	
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Red", "Yellow", "Green", "test"));
		
		
		ar.trimToSize();
		
		System.out.println(ar);
		
		
	}

}
