package patternPackage;

public class patterns {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print("*");
			}

			System.out.println(" ");
		}

		System.out.println("****************************************");

		for (int i = 0; i <= 5; i++) {

			for (int j = 5; j >= i; j--) {

				System.out.print("*");
			}

			System.out.println(" ");
		}

		System.out.println("************************************************");

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print(j + "");
			}
			System.out.println("");
		}

		System.out.println("**************************************************");

		int alpha = 72;

		for (int i = 0; i <= 5; i++) {

			for (int j = 0; j <= i; j++) {

				System.out.print((char) (alpha + j) + "");
			}

			System.out.println("");
		}

		System.out.println("************************************************************");

		for (int i = 0; i <= 6; i++) {

			for (int j = 6; j >= i; j--) {

				System.out.print(j + "");

			}

			System.out.println("");

		}

		System.out.println("**************************************************************");

	}

}
