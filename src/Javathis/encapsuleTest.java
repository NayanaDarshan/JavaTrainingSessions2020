package Javathis;

public class encapsuleTest {
	
	private String name;
	
	static private int age=35;
	
	static {
	   age=100;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name=name;
		
	}
	
	public int getage() {
		return age;
	}
	
	
}
