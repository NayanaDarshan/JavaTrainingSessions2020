package Javathis;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListdatafetch {

	//private static final int ArrayList = 0;

	public static void main(String[] args) {
		
		ArrayList<String> weekdaynames = new ArrayList<String>(Arrays.asList("May","June" ,"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"));
		
	
		for(int i =0; i< weekdaynames.size(); i++) {
			//System.out.println(weekdaynames.get(i));
			
			
			String weeknames= weekdaynames.get(i);
			
			if(weeknames.length()>3) {
				
				System.out.println("The string is ===> " + weeknames);
			}	
				else {
					
				}
				System.out.println("The last three characters===>" + weeknames.substring(weeknames.length()-3));
				
			}
		}
	
	}


