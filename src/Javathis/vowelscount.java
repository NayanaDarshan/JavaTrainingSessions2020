package Javathis;

import java.util.ArrayList;

public class vowelscount {

	public static void main(String[] args) {

		int count = getVowelcount("NayanaSmira");

		System.out.println(count);

	}

	public static int getVowelcount(String name) {
		int counter = 0;
		// String name = "Nayana";

		int length = name.length();

		for (int i = 0; i <= length - 1; i++) {

			Character ch = name.charAt(i);

			boolean status = isVowel(ch);

			// System.out.println(status);

			if (status == true) {

				counter = counter + 1;

			}

		}
		return counter;
	}

	public static boolean isVowel(Character ch) {

		ArrayList<Character> vowels = new ArrayList<Character>();

		vowels.add('a');

		vowels.add('e');

		vowels.add('i');

		vowels.add('o');

		vowels.add('u');

		vowels.add('A');

		vowels.add('E');

		vowels.add('I');

		vowels.add('O');

		vowels.add('U');

		for (int i = 0; i < vowels.size(); i++) {

			if (ch == vowels.get(i)) {

				return true;
			}

		}

		return false;
	}

}
