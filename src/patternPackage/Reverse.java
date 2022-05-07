package patternPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Reverse {

	public static void main(String[] args) {

		System.out.println(factorial(4));
		
		getReverseString("Smira");
		
	ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(10,20,20,30, 40,40, 50, 60, 60, 70, 80, 90, 100));
	
	num.removeIf(num1 -> num1%4==0);
	
	num.forEach(ele-> System.out.println(ele));
	
	for( int num2 : num) {
		System.out.println(num2);
	}
	
	ArrayList<Integer> num4 = new ArrayList<Integer>(Arrays.asList(165, 1578, 78, 65, 90, 8, 199));
	
	Collections.sort(num4);
	
	System.out.println("________________Sorted List____________________________________");
	num4.stream().forEach(ele -> System.out.println(ele));
	
	System.out.println("**********************************************************************");
		/*
		 * //num.retainAll(Collections.singleton(40));
		 * 
		 * System.out.println("Before removal");
		 * 
		 * num.stream().forEach(ele-> System.out.println(ele));
		 * 
		 * Set<Integer> removedduplicates = new HashSet<Integer>(num);
		 * 
		 * ArrayList<Integer> removedduplicate = new
		 * ArrayList<Integer>(removedduplicates);
		 * 
		 * System.out.println("After removal");
		 * 
		 * removedduplicate.stream().forEach(ele -> System.out.println(ele));
		 */
	
	System.out.println("String");
	String strn ="This is Nayana and she is a Nayana and she is Nayana";
	
	
	
	System.out.println(strn.indexOf("smira"));
	
	int index= strn.indexOf("Nayana");
	
	System.out.println(strn.indexOf("Nayana", 3));
	
	System.out.println(strn.indexOf("Nayana", (index+1)));

	String strn1= "This -is-Nayana-smira-darshan";
	
	String[] data =strn1.split("-");
	
	for (String data1 : data) {
		System.out.println("Splitted data===>" +data1.toString());
	}

	
	
	String strn2 =" Your transaction number is 4677888";
	
	String newstrn2 =strn2.replaceAll("[a-zA-Z]", "");
	
	System.out.println(newstrn2);
	
	String strn3 = "Nayana";
	
	System.out.println(strn3.charAt(5));
	
	String str[] = {"Nayana", "Smira"};
	
	String stnew1= "Nayana";
	
	if( str[0].equals(stnew1) ){
		System.out.println("equals");
	}
	else {
		System.out.println("Not equals");
	}
/*//	String stnew2 = new String("Nayana");
	
	if(stnew1==stnew2) {
		System.out.println("equal");
		
	}
	else {
		System.out.println("Not equals");
	}
	*/
	
	//System.out.println(stnew1.concat("Smira"));
	
	
	
	}
	


	
	


	public static void getReverseString(String str) {
		int len = str.length();

		String rev = "";

		for (int i = len - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		System.out.println("The reverse string===>" + rev);

	}
	
	public static int factorial(int num) {
		int result = 1;

		if (num == 0) {

			System.out.println("The fatcorial of num is ===>" + num);

		} else {
			for (int i = 1; i <= num; i++) {

				result = result * i;
			}
		}
		
		return result;

	}
	
	
}

