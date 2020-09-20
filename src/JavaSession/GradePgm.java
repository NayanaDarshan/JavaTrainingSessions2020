package JavaSession;

/*//8. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail*/

public class GradePgm {

	public static void main(String[] args) {

		GradePgm objgrade = new GradePgm();
		objgrade.gradeTest(67);
	}

	public String gradeTest(int marks) {
		String grade = " ";

		if (marks >= 91 && marks <= 100) {
			grade = "AA";
			System.out.println("The student grade is===>" + grade);
		}

		else if (marks >= 81 && marks <= 90) {
			grade = "BB";
			System.out.println("The student grade is===>" + grade);
		}

		else if (marks >= 71 && marks <= 80) {
			grade = "CC";
			System.out.println("The student grade is===>" + grade);
		} else if (marks >= 61 && marks <= 70) {
			grade = "BC";
			System.out.println("The student grade is===> " + grade);
		}

		else if (marks >= 51 && marks <= 60) {
			grade = "CD";
			System.out.println("The student grade is===>" + grade);
		} else if (marks >= 41 && marks <= 50) {
			grade = "DD";
			System.out.println("The student grade is===>" + grade);
		} else if (marks <= 40) {
			System.out.println("FAIL!!!!!!");
		}
		return grade;
	}
}
