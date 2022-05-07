package BasicSamplePrograms;

public class concatenateArray {

	public static void main(String[] args) {
	
		int a[] = {10, 20, 30, 40, 50};
		
		int b[] = {30, 40, 64, 5};
		
		int[] result = new int[a.length+b.length];
		
		System.arraycopy(a, 0, result, 0, a.length);
		
		System.arraycopy(b, 0, result, a.length, b.length);
		
		System.out.println(result.toString());
		
		for(int result1 : result) {
			System.out.println(result1);
		}
		
	}

}
