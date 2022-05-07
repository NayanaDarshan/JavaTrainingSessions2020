package BasicsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class swapArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Red", "Green", "pink", "purple", "yellow"));
	    
		
		for(String colorlist : ar) {
			System.out.println(colorlist);
		}
		
       System.out.println("Swapping the list");
       
       Collections.swap(ar, 2, 3);
       
       for(String swappedlist : ar) {
    	   System.out.println(swappedlist);
       }
	}

}
