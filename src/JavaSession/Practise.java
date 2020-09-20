package JavaSession;

public class Practise {
	String name;
	int age;
	int EmpID;
	int ar[] = new int[5];
	private char[] ar1;
	static String Sclass = "First class";

	public Practise() {
		System.out.println("Default constructor");
	}

	public Practise(String name, int age, int EmpID, int[] ar) {
		this.name = name;
		this.age = age;
		this.EmpID = EmpID;
		this.ar = ar;
	}

	public static void main(String[] args) {

		Practise p1 = new Practise();
		// int ara;
		int ar1[] = new int[5];
		ar1[0] = 11;
		ar1[1] = 12;
		ar1[2] = 13;
		ar1[3] = 14;
		ar1[4] = 15;
		// ar1[5]= 16;
		// System.out.println(ar1.length);

		for (int ara = 0; ara < ar1.length; ara++) {

			System.out.println(ar1[ara]);
		}

		Practise p2 = new Practise("Nayana", 34, 214875, ar1);
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.EmpID);
		System.out.println(p2.Sclass);
		// System.out.println(p2.ar1);

	}

}
