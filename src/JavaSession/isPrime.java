package JavaSession;

public class isPrime {

	// 7. Define a method to find out if number is prime or not.
	public static void main(String[] args) {
		isPrime obj3 = new isPrime();

		obj3.isprime(8);

	}

	public int isprime(int num) {
		int temp;
		
		for (int i =2; i<num; i++) {
		temp = num % 2;

		if (temp == 0) {

			System.out.println(" The given number is not prime==>" + num);
		} else {
			System.out.println("The given number is prime===>" + num);
		}

	

	}
		return num;
}

}