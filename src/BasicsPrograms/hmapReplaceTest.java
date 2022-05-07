package BasicsPrograms;

import java.util.HashMap;
import java.util.Map;

public class hmapReplaceTest {

	public static void main(String[] args) {
		HashMap<String, String> hmapTest = new HashMap<String, String>();
	    
		hmapTest.put("Smira", "daughter");
		
		hmapTest.put("Nayana", "Mother");
		
		hmapTest.put("Smaya", "Sister");
		
		hmapTest.put("Darshan", "Father");
	
	
		for(Map.Entry<String, String> family: hmapTest.entrySet()) {
			System.out.println(family.getKey()+"========="+family.getValue());
		}
	
		hmapTest.replaceAll((key, value) -> value.toUpperCase());

		for(Map.Entry<String, String> family: hmapTest.entrySet()) {
			System.out.println(family.getKey()+"========="+family.getValue());
		}
	}
	
	
	

}
