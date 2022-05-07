package BasicSamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Testconversion {

	public static void main(String[] args) {
		
		//Convert ArrayList to Array
	
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Red", "Blue", "grey", "green"));
         
		
		String[] colour = new String[ar.size()];
		
		ar.toArray(colour);
		
		for(String colour1 : colour) {
			System.out.println(colour1);
		}
		
		//Convert to Array -> ArrayList
		
		String[] car = {"BMW", "Audi", "Hyndai", "Mercedes"};
		
	System.out.println(car.toString());
	
	ArrayList<String> carddata= new ArrayList<String>(Arrays.asList(car));
	
	for(String car1: carddata) {
		System.out.println(car1);	
		
	}
	
	}

}
