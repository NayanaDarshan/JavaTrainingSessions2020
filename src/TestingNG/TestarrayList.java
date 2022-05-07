package TestingNG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class TestarrayList {

	public static void main(String[] args) {
	ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Nayana", "Smira", "Putti"));

		for(int i=0; i<ar.size(); i++) {
			String data= ar.get(i);
		
			if(data.length()>3) {
				
				System.out.println(data.substring(data.length()-3));
			}
			
			
			}

			
		HashMap<Integer, String> testMap = new HashMap<Integer, String>();
		
		testMap.put(1, "Nayana");
		
		testMap.put(2, "Smira");
		
		
		for(Map.Entry<Integer, String> data1: testMap.entrySet()) {
			System.out.println(data1.getKey());
			System.out.println(data1.getValue());
		}
	
		
	}

}
