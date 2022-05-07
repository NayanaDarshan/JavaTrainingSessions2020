package JavaSession;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class mapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		hmap.put(1, "Nayana");

		hmap.put(2, "Smira");

		hmap.put(3, "Tester");

		System.out.println(hmap.get(2));

		for( Integer i : hmap.keySet()) {
			System.out.println( i +  hmap.get(i));
		}
		
		for (Map.Entry<Integer, String> hmap1 :hmap.entrySet()) {
			System.out.println(hmap1.getKey() + "=====" + hmap1.getValue());
		}
	
		Iterator it = hmap.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry<Integer, String> map1 =(Entry<Integer, String>) it.next();
			
			System.out.println(map1.getKey() + "=====" +map1.getValue());
		}
		
		Integer myint= 5789;
        Double mudouble = 5.26;
        
        System.out.println(myint.intValue());
        System.out.println(mudouble.doubleValue());
        
        String str1 = myint.toString();
        
        System.out.println(str1);
        
        System.out.println(str1.length());
	}

}
