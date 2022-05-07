package BasicsPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class increaseListTest {

	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1, 2, 5, 6, 8,9));
		
		ar.ensureCapacity(3);
		
		System.out.println(ar);
	}

}
