package TestCode;

public class duplicateCharcount {

	public static void main(String[] args) {
		String str="nayana";
		int count=0;
		
		char[] c= str.toCharArray();

		for(int i=0; i< str.length(); i++) {
			for(int j=i+1; j< str.length(); j++) {
				
				if(c[i]==c[j]) {
					System.out.println(c[j]);
					count++;
					break;
				}
			}
		}
	}

}
