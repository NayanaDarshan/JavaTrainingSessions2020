package Javathis;

public class reverseStrin {

	public static void main(String[] args) {
			String givenText="The quick brown fox";
			
			char[] ch=givenText.toLowerCase().toCharArray();
			
			for( int i=ch.length-1; i>0; i--) {
				
				System.out.print(ch[i]);
			}
				
			

	}

}
