package Inheritance;

public class DomesticAnimal extends Animal {

	@Override
	public void walk() {

		System.out.println("Domestic Animal----Walk");

	}

	public void Sound() {
		System.out.println("Domestic Animal----make unique sounds");
	}
    
	@Override
	public void sleep() {
		System.out.println("Domestic Animal----Sleep");
	}
	

}

