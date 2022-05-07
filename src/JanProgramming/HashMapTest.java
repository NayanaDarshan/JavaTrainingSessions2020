package JanProgramming;

import java.util.HashMap;
import java.util.Map;

import JavaSession.HashMapDemo;

public class HashMapTest {

	public static void main(String[] args) {

		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();

		hmap1.put(1, "AA");
		hmap1.put(2, "BB");
		hmap1.put(3, "CC");
		hmap1.put(4, "DD");

		hmap1.forEach((k, v) -> System.out.println("Key==> " + k + " and value is ===>" + v));

		for (Map.Entry<Integer, String> maptest : hmap1.entrySet()) {
			System.out.println("Key are====>" + maptest.getKey());
			System.out.println("Value are===>" + maptest.getValue());
		}

	}

}
