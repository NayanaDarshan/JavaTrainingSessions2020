package TestCode;

import java.util.Scanner;

public class equalNumber {

	public static void main(String[] args) {
	
		System.out.println("Please enter the number1");
        	Scanner scn = new Scanner(System.in);
        	
        	int num =scn.nextInt();
        	System.out.println("Please enter the number2");

        	Scanner scn1= new Scanner(System.in);
        	
        	int num1=scn1.nextInt();
        	
	}

	
	public static int largeValue(int x, int y) {
		
		if(x==y)
			return 0;
		if(x%6==y%6) {
			
			return(x<y)?x :y;
			
		}
		return true;
	}
}
