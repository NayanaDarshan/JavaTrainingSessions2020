package Javathis;

public class Dog extends Animal{
	
	String name = "Dog";
	
	String breed= "Pug";
	
	public Dog() {
		
		System.out.println("Dog class constructor.....");
		
	}

	public static void main(String[] args) {
	
		
		
		Dog objdog= new Dog();
		
		objdog.display();
		
		objdog.eating();
		
		objdog.drinking();
		
		objdog.sleeping();
		
		
		

	}
	
	public void display() {
		System.out.println("The breed is ==>" + super.name);
		
		System.out.println("The name is ==> "+super.breed);
		
		System.out.println("The child class name ==>" +name);
		
		System.out.println("The child class breed ==>" +breed);
	}

	
	public void eating() {
		System.out.println("The dog is eating");
	}
	
	public void drinking() {
		System.out.println("The dog is drinking");
	}
	
	public void sleeping() {
		System.out.println("The dog is sleeping");
		
		super.drinking();
	}
}
