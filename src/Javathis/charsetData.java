package Javathis;

import java.nio.charset.Charset;

public class charsetData {

	public static void main(String[] args) {
		
	
		
		System.out.println("The available charset are===>");

		for(String str2 : Charset.availableCharsets().keySet()) {
		
		System.out.println(str2);
	
	}
		
		int n ='S';
		
		System.out.println("ASCII value of n is===>" +n);
        System.out.format("\nCurrent Date time: %tc%n\n", System.currentTimeMillis());

        System.out.format("\n Current date and time is : %tc%n\n", System.currentTimeMillis());
}
	
}