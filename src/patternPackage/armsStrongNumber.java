package patternPackage;

public class armsStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isArmsStrongNumber(678);
	}

	
	public static void isArmsStrongNumber(int num) {
		
		int r;
		
		int t;
		
		int count =0;
		
		t=num;
		
		while(num>0) {
			
			r= num%10;
			num=num/10;
			count= count+(r*r*r);	
			
		}
		
		if(t==count) {
			System.out.println("The number is armsstrong" +count);
		}
		else {
			System.out.println("The number is not armsstrong" +count);
		}
	}
}
