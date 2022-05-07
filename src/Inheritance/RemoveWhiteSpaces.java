package Inheritance;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String name = "Nayana  Smira";

		char[] ch = name.toCharArray();

		StringBuffer sb = new StringBuffer();

		for (int i = 0; i < ch.length; i++) {

			if (ch[i] != ' ' && ch[i] != '\t') {

				sb.append(ch[i]);

			}

		}
		System.out.print(sb);
	}

}
