package BasicSamplePrograms;

public class stringTest {

	public static void main(String[] args) {
		
		String str = new String("Nayana");
		String str2= new String("Nayana");
		
		String str1= "Nayana";
		
		System.out.println(str.equalsIgnoreCase(str1));
		
		System.out.println(str==str1);
		
		System.out.println(str.equals(str2));
		
		System.out.println(str==str2);
		
	String str3= "This is \"Smira\" reading";
			System.out.println(str3);
	

	int num=12345;
	int sum=0;
	
	while(num>0) {
		
		int digit = num%10;
		sum= sum*10+ digit;
		num=num/10;
		
	}
	System.out.println(sum);
	
	
	String s1= "Nayana";
	
	String s2="Darshan";
	
	String s3="Smira";
	
	String strnew= String.join("/", s1,s2,s3);
	
	System.out.println(strnew);
	}

}
