package Javathis;

public class threeDigit {

	public static void main(String[] args) {
	
		int amt=0;
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4;j++) {
				for(int k=1; k<=4; k++) {
					for( int l=1; l<=4; l++)
					if(l!=i && l!= j && l!=k && i!=j) {
						amt++;
						
						System.out.println(i + " "+ j + " "+k + " "+l);
					}
				}
			}
		}
	
	}

}
