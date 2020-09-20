package JavaSession;

public class ATest {

	public String cName;
	public String establishDate;
	private String grade;
	public int subjectCount;

	public ATest(String cName, String establishDate, String grade, int subjectCount) {
		this.cName = cName;
		this.establishDate = establishDate;
		this.grade = grade;
		this.subjectCount = subjectCount;

	}

	public static void main(String[] args) {

		ATest at = new ATest("PES College", "28-07-1986", "AA", 10);

		BTest bt = new BTest();
		System.out.println(bt.getBname());
		System.out.println(bt.getBclass());

		System.out.println("----------------------------------------------------------");
		bt.setBclass("PUC Class");
		System.out.println(bt.getBclass());
		bt.setBname("Nayana_Smira");
		System.out.println(bt.getBname());

		System.out.println("-----------------------------------------------------");

		System.out.println(at.cName);
		System.out.println(at.establishDate);
		System.out.println(at.grade);
		System.out.println(at.subjectCount);
	}

	public String getGrade() {
		return grade;
	}
}
