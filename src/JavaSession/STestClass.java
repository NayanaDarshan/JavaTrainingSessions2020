package JavaSession;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class STestClass {

	public static void main(String[] args) {
	System.out.println("1.***********************************************************************");
//1.  Write a program to check two different strings equality.

		String str1 = "Nayana Raghu";
		String str2 = "Nayana Raghu";

		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("The Given two strings are equal");
		} else {
			System.out.println("The Given two strings are not equal");
		}

		System.out.println("2.***********************************************************************");
//2. Remove all  spaces in a String . 
//For example  : “         Hello      Everyone       “ .     Expected result: “HelloEveryone”.

		String str3 = "          Hello      Everyone        ";
		String str4 = str3.trim();
		System.out.println("The Expected result string is ======" + str4.replace(" ", ""));

		System.out.println("3.**********************************************************************");
//3. Write a program that will  print out last character and first character of a word.`																																					`				

		String str5 = "Today we have solar eclipse and very cold climate";
		int length = str5.length();
		System.out.println("The first character of the string is ====>" + str5.charAt(0));
		System.out.println("The last character of the string is ====>" + str5.charAt(length - 1));

		System.out.println("4.**********************************************************************");
//4. Write a program to verify a word or a character contains in the sentence.
		str5 = "Today we have solar eclipse and very cold climate";

		String search_text = "eclipse";
		if (str5.contains(search_text)) {

			System.out.println("The searched text: " +search_text+ " exists in a given sentence");
		} else {
			System.out.println("The searched text: " + search_text + " is NOT exists in a given sentence");
		}
		System.out.println("5.**********************************************************************");
//5.Write a function/ method to reverse your own name.
		 str1 = "Nayana Raghu";
		 int len= str1.length();
		 String rev ="";
		 
		 for( int i=len-1; i>0; i--) {
			 
			 rev= rev+str1.charAt(i);		 		 
		 }
		 System.out.println(rev);
	System.out.println("6.**********************************************************************");
//6. Write a program that gives you last half of the string.
		str5 = "Today we have solar eclipse and very cold climate";

	System.out.println(str5.substring(str5.indexOf("eclipse")));
	

	System.out.println("7.**********************************************************************");
		
//7.Write a program to get the 3rd  “ e “ of the string .
    //For example: “Welcome to Naveen Automation Lab ! “.
	

	String str12= "Welcome to Naveen Automation Lab !";
	System.out.println("The first occurenece of e is: "+ str12.indexOf('e'));// 1st occurence
	
	//System.out.println(str12.indexOf("e", 2));
	System.out.println("The second occurence of e is: " +str12.indexOf("e", str12.indexOf('e')+1)); //second occurence
	
	int sec= str12.indexOf("e", str12.indexOf('e')+1);
	
	System.out.println(sec);
	 
	System.out.println("The Third occurence of e is: " +str12.indexOf("e", sec+1));// Third occurence
	
	int third= str12.indexOf("e", sec+1);
	System.out.println(third);
	
	System.out.println("The fourth occurence of e is: " +str12.indexOf("e", third+1));

	System.out.println("8. **********************************************************************");		
//8. Write a method which gives index of (-1) if string is not available. . it should return integer. if String is present, then it should return the specific index.
		
	String strn= "This is Selenium";
    System.out.println("if string is not present--------------------------------------------------");
	System.out.println(strn.indexOf("Java"));
	
	int num= strn.indexOf("Java");
	System.out.println(num);
	System.out.println("string is present--------------------------------------------------------");
	
	System.out.println("The searched text index is ==> " +strn.indexOf("Selenium"));
		
	System.out.println("9. **********************************************************************");	
//9. Write a program that breaks a whole string into small strings, and print out its all values . (Hint: split, loop) .
 
		String str8= "Learning-String-Class";
		 String[] str9= str8.split("-");
		 
		 for ( String str10 :str9) {
			 System.out.println(str10);
		 }
		
		 System.out.println("**********************************************************************");

//10. Assume that a string consists of 3 words, print out the middle one. 
		 str8= "Learning-String-Class";
		 System.out.println(str8.substring(9, 15));
		
		 
	System.out.println("**********************************************************************");
				 		 
//11. get only numeric part from this String:

//String s = "your transaction id is: 12345 and reference id is 34567";
		 
		 String s= "your transaction id is: 12345 and reference id is 34567";
		 
		 System.out.println(s.replaceAll("[^0-9]", ""));
		 //System.out.println(s.length());
		 String ID1 = s.substring(s.indexOf("is")+4,s.length()-26);
		 System.out.println("The first numeric number is :" +ID1);
		 int ID = s.indexOf("is" , s.indexOf("is")+1);
		 String ID2= s.substring(ID+3);
		 System.out.println("The second numeric number is :" +ID2);
		 
		 System.out.println("**********************************************************************");	 

		 
		 Pattern p = Pattern.compile("\\d+");
		 
		 Matcher m = p.matcher(s);
		 
		 while(m.find()) {
			 System.out.println(m.group());
		 }
		 
		 
		 
	}
}
