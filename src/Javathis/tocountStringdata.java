package Javathis;

public class tocountStringdata {

	public static void main(String[] args) {

		String name = " Nayana is learning coding 123 and smira watching mobile 456";
		toCountdata(name);
	}

	public static void toCountdata(String str) {
		char[] ch = str.toCharArray();

		int letter = 0;

		int spaces = 0;

		int words = 0;

		int number = 0;

		int other = 0;

		for (int i = 0; i < ch.length; i++) {

			if (Character.isDigit(ch[i])) {

				number++;

			} else if (Character.isLetter(ch[i])) {

				letter++;

			}

			else if (Character.isWhitespace(ch[i])) {
				spaces++;
			}

			else {
				other++;
			}
		}
		
		 System.out.println("The digit count is ===>" +number);
		 
		 System.out.println("The letter count is ====>" +letter);
		 
		 System.out.println("The spaces count is ====>" +spaces);
		 
		 System.out.println("The otherdata count is ===>" +other);
	}
}
