package encapsulationTest;

public class EncapTest {

	public static void main(String[] args) {
		Number n = new Number();

		n.setY(6);
		int num = n.getY();
		System.out.println("The number is ==>" +num);

	}

}
