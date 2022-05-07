package BasicSamplePrograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class acceptInteger {

	public static void main(String[] args) {
		
		/*
		 * System.out.println("Please enter the number");
		 * 
		 * Scanner scn = new Scanner(System.in);
		 * 
		 * int num =scn.nextInt();
		 * 
		 * System.out.println("The inputted number is ===>" +num);
		 * 
		 * //scn.close();
		 */
		
		System.out.println("Please enter the number from bufferedreader");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String name=reader.readLine();
			
			int number=reader.read();
		
			
			System.out.println(name +"==="+number);
			
			System.out.println("Please enter name again");
			
			String name1 =System.console().readLine();
			
			System.out.println(name1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
