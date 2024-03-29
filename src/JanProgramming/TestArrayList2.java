package JanProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TestArrayList2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		
		System.out.println(ar.size());
		
		/*
		 * System.out.println(ar.removeIf(num -> num%2==0));
		 * 
		 * System.out.println(ar);
		 */
		
		ar.removeIf(num-> num%2!=0);
		
		System.out.println(ar);
		
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Tom","Nayana", "Nayana", "Smira"));
		
		names.retainAll(Collections.singleton("Smira"));
		
		System.out.println(names);
		
		

	}

}
