package encapsulationTest;

public class staticBlockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Nayana.n);

	}

}
	class Nayana {

		public static final int n = 200;
	

	static {
		
		System.out.println("This is a static block");
	}
}
