package JanProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class compareToArrayList {

	public static void main(String[] args) {
		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E", "F"));

		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("B", "C", "A", "E", "F", "M"));

		Collections.sort(ar);

		Collections.sort(ar1);

		System.out.println(ar.equals(ar1));
		/*
		 * ar.removeAll(ar1); System.out.println(ar);
		 */

		/*
		 * ar1.removeAll(ar);
		 * 
		 * System.out.println(ar1);
		 */

	   ar1.retainAll(ar);
	   
	   System.out.println(ar1);

	}

}
