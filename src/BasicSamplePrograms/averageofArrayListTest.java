package BasicSamplePrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class averageofArrayListTest {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		
		double newnum =ar.stream().mapToInt(e -> e).average().getAsDouble();
		
		System.out.println(newnum);
	}

}
