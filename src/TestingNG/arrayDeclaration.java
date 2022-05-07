package TestingNG;

public class arrayDeclaration {

	public static void main(String[] args) {
		
		/*
		 * String a[] = {"a", "b","c"};
		 * 
		 * System.out.println(a[0]);
		 */
		
		String b[]= new String[5];
		System.out.println(b.length);
		
		b[0]="Nayana";
		b[1]="suma";
		b[2]="Geetha";
		b[3]="Smira";
		b[4]="putti";
		//b[5]="puspha";
		
		try {
			
			for (int i=0; i<b.length; i++) {
				
				System.out.println("The names are ====>" +b[i]);
			}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		
			
		}
		
		
		
	}
	


}
