package TestCode;

import java.util.HashMap;

public class TocountWord {

	public static void main(String[] args) {
		String strName = "This is Smira smira and mother is Nayana nayana";

		String[] word = strName.toLowerCase().split(" ");

		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

		for (int i = 0; i < word.length; i++) {

			if (wordMap.containsKey(word[i])) {

				int count = wordMap.get(word[i]);

				wordMap.put(word[i], count + 1);
			} else {
				wordMap.put(word[i], 1);
			}
		}

		System.out.println(wordMap);
	}

}
