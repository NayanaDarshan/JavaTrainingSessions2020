package BasicsPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class retainAllTest {

	public static void main(String[] args) {
		ArrayList<String> colours= new ArrayList<String>(Arrays.asList("Red", "Yellow", "Green", "Blue"));
		
		ArrayList<String> colours1= new ArrayList<String>(Arrays.asList("Red", "Yellow", "Green"));
		
       boolean status =colours.retainAll(colours1);
       
      
       
       
       if(status) {
    	   for( String uncolours :colours) {
    		   System.out.println(uncolours);
    	   }
       }
		
		

	}

}
