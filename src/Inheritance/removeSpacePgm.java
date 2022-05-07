package Inheritance;

public class removeSpacePgm {

	public static void main(String[] args) {
		String str= "Nayana      Smira     Smaya";
		
	System.out.println(str.replaceAll("\\s", ""));
	
	String str1 ="ABCCDDD";
	int count=0;
	char[] ch =str1.toCharArray();
	
	for(int i=0; i<ch.length; i++) {
		for( int j = i+1; j<ch.length; j++) {
			if(ch[i]==ch[j]) {
				System.out.println(str1.charAt(i));
				count++;
			
			}
		}
	}
	
	}	
	
}
