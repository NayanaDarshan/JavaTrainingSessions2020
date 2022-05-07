package Inheritance;

public class largestNumber {

	public static void main(String[] args) {

		int arr[]= {10,88,30,66,22,105,28};
		
		int largest =0;
		
		int secondLargest=0;
		
		for(int i=0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
			
		}

		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]> largest) {
				secondLargest= largest;
				largest =arr[i];
				
			}
			
			else if(arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		

		System.out.println("Second laregst number===>" +secondLargest);
		
		System.out.println("First largest number====>" +largest);
	}

}
