/*Question 2: 
// Step 1: Declare variables private in the class.
        private String stdName; // private field.
        private int stdRollNo;
        private int stdId;
--create the construtor of this class with all class vars.

// Step 2: Apply public getter method for each private vairables in the class.
      
// Step 3: Apply public setter method for each private variables in the class.

//step 4: Set the class vars using constructor and try to get the values using getter method.
*/
package encapsulationTest;

public class studentClass {

	private String stdName;
	private int stdRollNo;
	private int stdId;

	public studentClass(String stdName, int stdRollNo, int stdId) {
		this.stdName = stdName;
		this.stdRollNo = stdRollNo;
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdRollNo() {
		return stdRollNo;
	}

	public void setStdRollNo(int stdRollNo) {
		this.stdRollNo = stdRollNo;
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public static void main(String[] args) {

		studentClass std = new studentClass("Nayana", 16, 214875);
		System.out.println("The student name: ==>" + std.getStdName());
		System.out.println("The student roll number: ==>" + std.getStdRollNo());
		System.out.println("The student ID is: ==>" + std.getStdId());
	}

}
