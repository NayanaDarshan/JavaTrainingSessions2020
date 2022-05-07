package BasicsPrograms;

public class enpasulationTest {
	
	private int age;
	private String name;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int getAge() {
		return this.age;	
	
	}
	

	public void setAge(int age) {
		this.age=age;
		if(this.age>=18) {
			System.out.println("The girl/boy is matured");
		}
		else {
			System.out.println("The girl/boy is under age");
		}
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		
		return this.name=name;
		
	
	}
	
}
