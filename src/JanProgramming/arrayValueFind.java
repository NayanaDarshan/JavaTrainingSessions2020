package JanProgramming;

public class arrayValueFind {

	public static void main(String[] args) {
		int a[] = { 10, 20, 45, 67, 89, 90 };

		boolean status = false;
		
		for (int n : a) {

			if (n == 0) {
				status = true;
				break;
			}
			
		}
		if (status) {
			System.out.println("The result found");
		} else {
			System.out.println("The result NOT found");
		}
	}
	

}