package BasicsPrograms;

import java.util.HashMap;
import java.util.Map;

public class hashMapIterate {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Nayana");
		hmap.put(2, "Smira");
		hmap.put(3, "Smaya");
		hmap.put(4, "Sharavika");
		hmap.put(null, "puttu");
		hmap.put(null, "putti");
		
		hmap.forEach((k,v) -> System.out.println("Key-->"+k +"and"+ "value-->" +v));

		for (Map.Entry<Integer, String> e : hmap.entrySet()) {

			System.out.println(e.getKey() + "============" + e.getValue());
		}

		for (Integer i : hmap.keySet()) {
			System.out.println(i);
		}
		for (String str : hmap.values()) {
			System.out.println(str);
		}
		
	
		
	}

}
