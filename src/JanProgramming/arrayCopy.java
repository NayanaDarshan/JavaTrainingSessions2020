package JanProgramming;

import java.util.Arrays;

public class arrayCopy {

	public static void main(String[] args) {

		 int a[]= {4,5,6,7,8};
		 
		 int b[]= {10,56,78,89,90};
		 
		 int result[]= new int[a.length+b.length];
		 
		 System.arraycopy(a, 0, result, 0, a.length);
		 
		 System.arraycopy(b, 0, result, a.length, b.length);
		 
		 System.out.println(Arrays.toString(result));
	}

}
