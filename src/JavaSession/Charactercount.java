package JavaSession;

import java.util.HashMap;

public class Charactercount {

	public static void main(String[] args) {
		String name = "darshan";

		int len = name.length();

		int count;

		HashMap<Character, Integer> namesMap = new HashMap<Character, Integer>();

		for (int i = len - 1; i >= 0; i--) {

			if (namesMap.containsKey(name.charAt(i))) {

				count = namesMap.get(name.charAt(i));
				namesMap.put(name.charAt(i), ++count);
			}

			else {
				namesMap.put(name.charAt(i), 1);
			}

		

		}
		System.out.println(namesMap);
	}

}
