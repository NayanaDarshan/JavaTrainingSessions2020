package JavaSession;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

public class hashtabletest {

	public static void main(String[] args) {
		Hashtable<String, String> h = new Hashtable<String, String>();

		h.put("1", "Nayana");
		h.put("2", "Darshan");
		h.put("3", "Smira");

		System.out.println(h.get("3"));

		Enumeration enum1 = h.elements();

		System.out.println("Print values from hashtable enum1");

		while (enum1.hasMoreElements()) {
			System.out.println(enum1.nextElement());
		}

		System.out.println("++++++++++++++++++++++++++++++++++++++++++");

		Iterator<Entry<String, String>> it = h.entrySet().iterator();

		while (it.hasNext()) {

			Entry data = it.next();
			System.out.println("The key is===>" + data.getKey() + "and value is====>" + data.getValue());
		}

		System.out.println("The hascode of h is===>" + h.hashCode());
		
		//-128 to 127

		Integer it3 = 127;

		Integer it5 = 127;

		if (it3 == it5) {
			System.out.println("The values are equal");
		} else {
			System.out.println("The values are NOT equal");

		}

	}

}
