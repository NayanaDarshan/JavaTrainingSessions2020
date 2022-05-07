package BasicsPrograms;

public class bubbleSort {

	public static void main(String[] args) {
	
		int ar[]= {34,56,20,90,35,60,73};
		
		int temp=0;
		
		for(int i=0; i<ar.length; i++) {
			for(int j=1; j<ar.length-i; j++) {
				
				if(ar[j-1]> ar[j]) {
					temp= ar[j];
					ar[j]= ar[j-1];
					ar[j-1]= temp;
				}
			}
		
			System.out.println(ar[i]);
		}
	}

}
