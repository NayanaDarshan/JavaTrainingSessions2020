package TestCode;

import java.util.HashMap;

public class countWords {

	public static void main(String[] args) {
		String str = "This is Nayana Nayana and smira Smira";
		
		
		String[] splitStr= str.toLowerCase().split(" ");

		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();

		for (int i = 0; i < splitStr.length; i++) {

			if (wordMap.containsKey(splitStr[i])) {
				
				int count=wordMap.get(splitStr[i]);

				wordMap.put(splitStr[i], count+1);

			}

			else {
				wordMap.put(splitStr[i], 1);
			}
		}

		System.out.println(wordMap);
	}

}
