package Javathis;

public class Employee {
	
	String name;
	
	String age;
	
	Address address;
	
	Employee(String name, String age, Address address){
		this.name= name;
		this.age=age;
		this.address= address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address a1= new Address("AK", "Mandya", "Karnataka");
		
		Address a2= new Address("KL", "Mandya", "Karanatak");
		
		Employee e1= new Employee("Nayana", "35", a1);
		
		Employee e2 = new Employee("Smira", "5", a2);
		
		e1.display();
		
		e2.display();

	}

	public void display() {
		
		System.out.println("The name is :  " + name +"age ==>" +age);
		
		System.out.println("The area is" + address.area +"city is==>" +address.city+"state is ===>" +address.state);
	}
}
