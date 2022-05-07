package JanProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayListArray {

	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>(Arrays.asList("Smira", "Nayana", "Darshan"));

		System.out.println(ar.size());
		
		Object[] ar1 = ar.toArray();

		System.out.println(Arrays.toString(ar1));

		System.out.println(ar1.length);
	}

}
