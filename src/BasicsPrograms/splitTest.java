package BasicsPrograms;

import java.util.Calendar;

public class splitTest {

	public static void main(String[] args) {
	String str = "a+b+c+d+e";
	System.out.println(str.length());
	
	String [] strarr= str.split("\\+", 2);
	
	for (String str1 : strarr) {
		System.out.println(str1);
	}
	
	Calendar c = Calendar.getInstance();
	
	System.out.println("Current date and time");
	
	System.out.format("%tB %te,%tY%n", c,c,c);
	
	System.out.format("%tl:%tM,%tp%n", c,c,c);
	
	String str1= "Nayana";
	
	byte[] bytearr=str1.getBytes();
	
	for(byte b :bytearr) {
		System.out.println(b);
	}
	
	String strnew = new String(bytearr);
	
	System.out.println(strnew);
	
	System.out.println(strnew.hashCode());
	
	String strnew1= "Your transation id-12345";
	
	System.out.println(strnew1.replaceAll("[a-zA-Z]", "").trim());
	}

}
