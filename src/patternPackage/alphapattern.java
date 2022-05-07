package patternPackage;

public class alphapattern {

	public static void main(String[] args) {
		int alpha=70;
		
		for (int i=0; i<=4; i++) {
			
			for(int j=0; j<=i; j++) {
				
				System.out.print( (char)(alpha+j) + " ");
				
			}
			//alpha++;
			System.out.println(" ");
		}

	}

}
