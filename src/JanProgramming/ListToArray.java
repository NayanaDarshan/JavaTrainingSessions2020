package JanProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArray {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Nayana", "Smira", "Darshan", "Mandya"));
		System.out.println(ar);
		String ar1[] = new String[4];

		ar.toArray(ar1);

		for (String s : ar1) {
			System.out.println(s);
		}

	}

}
