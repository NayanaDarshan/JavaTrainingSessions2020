package JavaSession;

import java.util.Scanner;

public class PatternPgms {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 System.out.println("Please enter the number");
	 
	 int row = scan.nextInt();
	 
	 int i;
	 
	 for ( i=0; i<=row; i++) {
		 
		 for (int j=0; j<=i; j++) {
		 
	    	 System.out.print(j+ " ");
	     }
		 System.out.println();
	 }
			 
     
	}

}
