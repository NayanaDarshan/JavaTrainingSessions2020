package JavaSession;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, String> members = new HashMap<String, String>();

		members.put("Father", "Darshan");
		members.put("Mother", "Nayana");
		members.put("Daughter", "Smira.D");
		
		//keyset()
		
		Iterator<String> it =members.keySet().iterator();
		
		while(it.hasNext()) {
			
			String key=it.next();
			String value =members.get(key);
			
			System.out.println("The Key is:===>"+key +" and The value is:===>"+value);
				
		}
		
		
		//entryset
		
			Iterator<Entry<String,String>> it1= members.entrySet().iterator();
			
			while(it1.hasNext()) {
				
			Entry<String, String>entry=	it1.next();
			System.out.println("The key is==>"+entry.getKey()+"The values is ==>"+entry.getValue());
			}
		
			members.forEach((k,v) -> System.out.println("The key is: "+k +"The value is: "+v));
	
	//comparison of maps can be performed based on Key and Value pair format
	
	HashMap<Integer,String> Map1 = new HashMap<Integer, String>();
	Map1.put(1, "A");
	Map1.put(2,  "B");
	Map1.put(3,  "C");
	
	HashMap<Integer,String> Map2 = new HashMap<Integer, String>();
	Map2.put(1, "A");
	Map2.put(2,  "B");
	Map2.put(3,  "C");
	
	HashMap<Integer,String> Map3 = new HashMap<Integer, String>();
	Map3.put(1, "A");
	Map3.put(2,  "B");
	Map3.put(3,  "C");
	Map3.put(3,  "D");
	
	System.out.println(Map1.equals(Map2));
	
	
	
	//IT - Find out the Extra key in the HashMap

	HashMap<Integer,String> Map4 = new HashMap<Integer, String>();
	Map4.put(1, "A");
	Map4.put(2,  "B");
	Map4.put(3,  "C");
	
	HashMap<Integer,String> Map5 = new HashMap<Integer, String>();
	Map5.put(1, "A");
	Map5.put(2,  "B");
	Map5.put(3,  "C");
	Map5.put(4, "D");
	Map5.put(5, "E");
	
	
	HashSet<Integer> combineKeys = new HashSet<Integer>(Map4.keySet());
	
	combineKeys.addAll(Map5.keySet());
	combineKeys.removeAll(Map4.keySet());
	
	System.out.println("The missing keys are ===>"+combineKeys);
	

	HashMap<Integer,String> Map7 = new HashMap<Integer, String>();
	Map7.put(1, "A");
	Map7.put(2,  "B");
	Map7.put(3,  "C");
	Map7.put(4, "D");
	Map7.put(5, "E");
	
	Iterator<Integer> itm =Map7.keySet().iterator();
	
	while(itm.hasNext()) {
		Integer key = itm.next();
		String value = Map7.get(key);
		
		System.out.println("The key :"+ key + "The value is :" +value);
		
		
	}
	
	
	//Immutable map creation
	Map<String, Integer> map100 =Collections.singletonMap("Nayana", 300);
	
	System.out.println(map100.get("Nayana"));
	
//	map100.put("Smira", 500); //UnsupportedOperationException
}
	
}
