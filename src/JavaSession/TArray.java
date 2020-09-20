package JavaSession;

public class TArray {

	public static void main(String[] args) {
		/*
		 * Question 1: Write a program to print the following pattern using for loop:
		 * 
		 * 00 01 02 03 04 05 06 07 08 09 
		 * 10 11 12 13 14 15 16 17 18 19 
		 * 20 21 22 23 24 25 26 27 28 29 
		 * 30 31 32 33 34 35 36 37 38 39
		 */

		for ( int k=0; k<=9; k++) {
			
			for ( int p=0;p<=9; p++) {
				
				System.out.print(k+""+p+" ");
			}
			
			System.out.println();
		}
	
		System.out.println("*********************************************************************************");

		/*
		 * Question 2: Write a program to create a static Array, having following
		 * cricket data: --name, age, team name, DOB, gender, Strike Rate --Try to
		 * create multiple Object Arrays for different players --Try to print all the
		 * values of each player on the console
		 */
		Object[] playerdata = new Object[6];

		playerdata[0] = "Sachin";
		playerdata[1] = 40;
		playerdata[2] = "Team A";
		playerdata[3] = "28-07-1986";
		playerdata[4] = 'M';
		playerdata[5] = 2890.8980;

		Object[] playerdata1 = new Object[6];
		playerdata1[0] = "Doni";
		playerdata1[1] = 41;
		playerdata1[2] = "Team B";
		playerdata1[3] = "19-03-1987";
		playerdata1[4] = 'M';
		playerdata1[5] = 78878.999;

		for (Object Pdata1 : playerdata) {
			System.out.println(Pdata1);
		}
		for (Object Pdata2 : playerdata1) {
			System.out.println(Pdata2);
		}

		/*
		 * Question 3: Try to print the following pattern on the console: n = 4 n = 3 n=
		 * 2 n = 1 n = 0
		 */
    System.out.println("******************************************************************************");
		int n[] = { 4, 3, 2, 1, 0 };

		for (int m : n) {
			System.out.println("n" + "=" + m);
		
			
		}

	}
}
