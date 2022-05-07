package JavaSession;

import java.util.Scanner;

/*Write a Java program to extract the first half of a string of even length. Go to the editor
Test Data: Python
Sample Output:
Pyt*/
public class evenTest {

	public static void main(String[] args) {
		System.out.println("please enter the text");
		Scanner scn = new Scanner(System.in);
		String text =scn.nextLine();
		
		System.out.println(text.substring(0, text.length()/2));
	}

}
