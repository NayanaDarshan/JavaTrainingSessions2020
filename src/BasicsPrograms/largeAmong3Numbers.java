package BasicsPrograms;

public class largeAmong3Numbers {

	public static void main(String[] args) {
		int n1=789;
		
		int n2=457;
		
		int n3=213;
		
		if(n1>=n2 && n1>=n3) {
			System.out.println("n1 is greatest");
		}
		else if(n2>=n3 && n2>=n1) {
			System.out.println("n2 is greatest");
		}
		else {
			System.out.println("n3 is greatest");
		}

	}

}
