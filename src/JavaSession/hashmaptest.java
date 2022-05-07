package JavaSession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashmaptest {

	public static void main(String[] args) {
		HashMap<String, String> capitalmap = new HashMap<String, String>();
		capitalmap.put("Banglore", "Karnataka");
		capitalmap.put("New Delhi", "Delhi");
		capitalmap.put("Udupi", "Manglore");
		System.out.println(capitalmap.get("Banglore"));


		Iterator<Entry<String, String>> it = capitalmap.entrySet().iterator();
 
		while (it.hasNext()) {
			Entry<String, String> data = it.next();

			System.out.println("Key is ==>:" + data.getKey() + " and the Value is :===>" + data.getValue());
		
		
		}

		ArrayList<String> cityname = new ArrayList<String>(capitalmap.keySet());
		
		for (String s : cityname) {
			System.out.println("The key list are==>"+s);
		}
		
	
		ArrayList<String> capitaldata = new ArrayList<String>(capitalmap.values());
				
				for (String capitals: capitaldata) {
					System.out.println("The capital values aree===>"+capitals);
				}
		
		Iterator it1 = capitalmap.keySet().iterator();

		while (it1.hasNext()) {
			String key = (String) it1.next();
			// System.out.println(capitalmap.get(key));
			System.out.println(key);
		}
	}

}
