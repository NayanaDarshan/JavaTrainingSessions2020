package JavaSession;

import java.util.Scanner;

public class averageNumbers {

	public static void main(String[] args) {
		
    Scanner scn = new Scanner(System.in);
	System.out.println("Please enter the number");
    int firstNum=scn.nextInt();
    int secondNum=scn.nextInt();
    int thirdNum=scn.nextInt();
	
    int average= (firstNum+secondNum+thirdNum)/2;
    
    System.out.println(average);
	}
	

}
