package JavaSession;

import java.util.ArrayList;

public class Multiplereturn {

	public static void main(String[] args) {

		Multiplereturn obj = new Multiplereturn();

		ArrayList<String> ar1 = new ArrayList<String>();

		ar1 = obj.getStudentnames("Secondclass");

		for (int i = 0; i < ar1.size(); i++) {
			System.out.println("The student names from FOR LOOP===>" + ar1.get(i));
		}

		for (String stuname : ar1) {
			System.out.println("The student names from FOR EACH LOOP===>" + stuname);
		}
		
	     ar1.forEach(ar3 ->System.out.println(ar3));
	     
	     ar1.stream().forEach(System.out::println);
	
	}	     
	     
	public ArrayList<String> getStudentnames(String classname) {

		ArrayList<String> studentname = new ArrayList<String>();

		if (classname.equalsIgnoreCase("Firstclass")) {
			studentname.add("Tom");
			studentname.add("Dick");
			studentname.add("Harry");

		}

		else if (classname.equalsIgnoreCase("Secondclass")) {

			studentname.add("Nayana");
			studentname.add("Smira");
			studentname.add("darshan");

		}

		else if (classname.equalsIgnoreCase("Thirdclass")) {
			studentname.add("Ram");
			studentname.add("Alex");
			studentname.add("Gowri");
		}

		else {
			System.out.println("Please enter valid class");
		}

		return studentname;
	}

}
	
	