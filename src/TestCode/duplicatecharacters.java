package TestCode;

import java.util.HashMap;

public class duplicatecharacters {

	public static void main(String[] args) {
		String name = "Naaaayanaa is Nayana nayana";

		HashMap<String, Integer> charMap = new HashMap<String, Integer>();

		String[] word = name.toLowerCase().split(" ");

		for (String c : word) {
			if (charMap.containsKey(c)) {

				int count = charMap.get(c);

				charMap.put(c, count + 1);
			} else {
				charMap.put(c, 1);
			}
		}
		System.out.println(charMap);
	}

}
