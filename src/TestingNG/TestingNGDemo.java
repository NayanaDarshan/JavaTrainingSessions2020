package TestingNG;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class TestingNGDemo {

	@Test

	public void startTest() {

		System.out.println("Firt TestNG Method");

		int a = 100;
		int b = 200;
		String c = "abc";

		System.out.println(c + b + a);

		String name = "Nayana Smiran darshan and";
		/*
		 * System.out.println(name.charAt(4));
		 * 
		 * System.out.println(name.length());
		 */
		/*
		 * System.out.println(name.indexOf('S'));
		 * 
		 * System.out.println(name.indexOf('n', 3));
		 * 
		 * System.out.println(name.indexOf("ana"));
		 */
		System.out.println(name.indexOf('n'));

		System.out.println("second index===>" + name.indexOf('n', name.indexOf('n') + 1));

		int index = name.indexOf('n', name.indexOf('n') + 1);

		System.out.println(index);
		System.out.println("Third index===>" + name.indexOf('n', (index) + 1));

		int index1 = name.indexOf('n', (index) + 1);
		System.out.println("Fourth index===>" + name.indexOf('n', (index1) + 1));

		String str = "Nayana_Darshan_Smira";

		System.out.println(str.split("_")[0]);

		System.out.println(str.substring(str.indexOf("ana_"), str.indexOf("han")));

		String str1 = "bbb";

		String rev = "";

		for (int i = str1.length() - 1; i >= 0; i--) {

			rev = rev + str1.charAt(i);

		}

		System.out.println(rev);

		if (str1.equalsIgnoreCase(rev)) {

			System.out.println("The string is palindrome");
		} else {
			System.out.println("String is not palindrome");

		}

		String s1 = "The transaction id is :12345";

		String s[] = s1.split(":");

		System.out.println(s.length);

		for (String s2 : s) {
			System.out.println(s2.toString());
		}

		System.out.println(s1.replaceAll("[^0-9]", ""));

		String s3 = "Your id is 4567 and amount is 89898 and number 678977";

		Pattern p = Pattern.compile("\\d+");

		Matcher m = p.matcher(s3);

		while (m.find()) {
			System.out.println(m.group());
		}

		StringBuffer sm = new StringBuffer(s3);

		System.out.println(sm.reverse());

		Object empdata[] = new Object[5];

		empdata[0] = "Nayana";
		empdata[1] = 35;
		empdata[2] = "Mandya";
		empdata[3] = 's';
		empdata[4] = 23.56;

		// System.out.println(empdata[5]);

		/*
		 * for( Object e: empdata) { System.out.println(e); }
		 */
		int m1 = 0;
		// System.out.println(m1);

		System.out.println(empdata.length);

		// 0<5
		while (m1 < empdata.length) {

			System.out.println(empdata[m1]);
			m1++;

		}

	}

	@Test(priority=1)

	public void mapTest() {

		HashMap<String, String> data = new HashMap<String, String>();

		data.put("Name", "Smira");
		data.put("age", "5");
		data.put("sex", "girl");

		Set<Entry<String, String>> test = data.entrySet();

		for (Entry<String, String> empdata : test) {
			System.out.println("The Key is ==>" + empdata.getKey() + " The value is===> " + empdata.getValue());
		}

		Set<String> keys = data.keySet();
		System.out.println(keys);

		
		for (String s : data.values()) {
			System.out.println("value is ===>"+ s);
		}
		
		data.forEach((k,v) -> System.out.println("key is ==>" +k +" value is ==>" +v));
	}

	

}
