/*Constructor Assignments:
1. Design a University class template with the following features:
 variables:
name
country
stablishedDate
List of course provided in Array List<String>

--Write the get method of each variable with return keyword, which will return the respective class variable. 
For example:
public getName(){
    return name;
}
*/
package JavaSession;

import java.util.ArrayList;

public class TestMethodReturn {

	String uname;
	String country;
	String establishDate;
	static ArrayList<String> coursename;

	public static void main(String[] args) {
		System.out.println(getUname("VTU"));
		System.out.println(getCountry("INDIA"));
		System.out.println(getEstablishdate("28-07-1964"));
		ArrayList<String> coursedetails =getCourseName(coursename);
		coursedetails.forEach(coursedetails1 -> System.out.println(coursedetails1));
	}

	public static String getUname(String uname) {
		//System.out.println("The University name is ==>" + uname);
		return uname;
	}

	public static String getCountry(String country) {
		//System.out.println("University is present in ==> " + country);
		return country;
	}

	public static String getEstablishdate(String establishdate) {
		//System.out.println("The University established in===>" +establishdate);
		return establishdate;
	}
	
	public static ArrayList<String> getCourseName( ArrayList<String> coursename){
		
		ArrayList<String> coursedetails = new ArrayList<String>();
		
		coursedetails.add("Bachelor of Computer science");
		coursedetails.add("Bachelor of Information science");
		coursedetails.add("Bachelore of Mechanical Engg");
		coursedetails.add("Bachelor of Environmental Engg");
		coursedetails.add("Master of Mechanical Engg");
		
		//System.out.println("The courses offered by university are===>" +coursedetails);
		return coursedetails;
		
	}
}
