package BasicSamplePrograms;

public class constructorCallThis {

	static int a=10 ;
	
	static int b=20;
	
	
	public constructorCallThis() {
		this(a);
		
	}
	
	public constructorCallThis(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println(a+ "====" +b);
	}
	
	public constructorCallThis(int a) {
		this(a,b);
		System.out.println(a+"====");
	}
	

	public static void main(String[] args) {
	
		constructorCallThis obj = new constructorCallThis();
		constructorCallThis obj1 = new constructorCallThis(8);
	}

}
