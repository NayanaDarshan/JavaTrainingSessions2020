/*Constructor Assignments:
1. Design a University class template with the following features:
 variables:
name
country
stablishedDate
List of course provided in Array List<String>

--Design the constructor of this class with different parameters and all parameters.

----Write the get method of each variable with return keyword, which will return the respective class variable. For example:
public getName(){
    return name;
}
*/

package JavaSession;

import java.util.ArrayList;

public class UniversityClass {

	String uname;
	String country;
	String establishDate;
	ArrayList<String> coursesname;

	public UniversityClass() {

	}

	public UniversityClass(String uname, String country) {
		this.uname = uname;
		this.country = country;
	}

	public UniversityClass(String uname, String country, String establishDate) {
		this.uname = uname;
		this.country = country;
		this.establishDate = establishDate;

	}

	public UniversityClass(String uname, String country, String establishDate, ArrayList<String> coursename) {
		this.uname = uname;
		this.country = country;
		this.establishDate = establishDate;
		this.coursesname = coursename;
	}

	public static void main(String[] args) {

		UniversityClass uc = new UniversityClass("University of Texas", "USA");
		System.out.println("--------2 Constructor values-----------------------------");
		System.out.println(uc.getUname());
		System.out.println(uc.getCountry());

		UniversityClass uc4 = new UniversityClass("Univeristy of London", "London", "1986");

		System.out.println("--------------- 3 Constructor values---------------------");
		System.out.println(uc4.getUname());
		System.out.println(uc4.getCountry());
		System.out.println(uc4.getEstablishdate());

		ArrayList<String> coursename = new ArrayList<String>();

		coursename.add("Bachelor of Computer science");
		coursename.add("Bachelor of Information science");
		coursename.add("Bachelore of Mechanical Engg");
		coursename.add("Bachelor of Environmental Engg");
		coursename.add("Master of Mechanical Engg");

		UniversityClass uc2 = new UniversityClass("VTU", "INDIA", "28-07-1964", coursename);
		System.out.println("---------------All Constructor values--------------------");
		System.out.println(uc2.getUname());
		System.out.println(uc2.getCountry());
		System.out.println(uc2.getEstablishdate());
		ArrayList<String> courseList = uc2.getCoursedetails();
		courseList.stream().forEach(System.out::println);

	}

	public String getUname() {
		return uname;
	}

	public String getCountry() {
		return country;
	}

	public String getEstablishdate() {
		return establishDate;
	}

	public ArrayList<String> getCoursedetails() {
		return coursesname;
	}
}
