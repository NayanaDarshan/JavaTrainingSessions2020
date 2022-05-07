package BasicSamplePrograms;

public class constructorcall {
	
	int sum;

	public static void main(String[] args) {
		
		constructorcall obj = new constructorcall();

	}

	public constructorcall() {
		this(5,3);
		System.out.println("default contsructor call");
	}
	
	public constructorcall(int a , int b) {
		this.sum= a+b;
	}
}
