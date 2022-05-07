package TestCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class TestHashMapIteration {

	public static void main(String[] args) {
	
		HashMap<String, Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("Nayana", 100);
		hmap.put("Smira", 101);
		
		System.out.println("**********************Set1****************************");
		
		Iterator it =hmap.entrySet().iterator();
		
		while(it.hasNext()) {
			
		Map.Entry<String, Integer>map=	(Entry<String, Integer>) it.next();
		
		System.out.println(map.getKey() +"===="+ map.getValue());
		}
		
		System.out.println("***************Set2******************************");
		for(Map.Entry<String, Integer> map1 : hmap.entrySet()) {
			System.out.println(map1.getKey() +"======" +map1.getValue());
		}
	}

}
