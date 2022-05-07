package JanProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
	
		ArrayList<Integer> ar = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,5,5,6,6,7,8,9,10,23,45,66));
		
		
		LinkedHashSet<Integer> s1 = new LinkedHashSet<Integer>(ar);
		
		ArrayList<Integer> ar2 = new ArrayList<Integer>(s1);
		
		for(Integer i : ar2) {
			System.out.println(i);
		}
		
		System.out.println(ar.stream().distinct().collect(Collectors.toList()));
	}

}
