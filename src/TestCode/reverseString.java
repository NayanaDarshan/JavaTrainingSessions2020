package TestCode;

public class reverseString {

	public static void main(String[] args) {

		String str= "Nayana";
		
		char[] ch=str.toCharArray();
		
		for(char c :ch) {
			System.out.println(c);
		}
		
		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(ch[i]);
		}

		String  rev=" ";
		
		for(int i = str.length()-1; i>=0; i--) {
			
			rev= rev+str.charAt(i);
			
		}
		System.out.println("\n"+rev);

		String newstr[]= str.split("");
		
		for(int j= str.length()-1; j>=0; j--) {
			System.out.print(newstr[j]);
		}
		
	}
	


}