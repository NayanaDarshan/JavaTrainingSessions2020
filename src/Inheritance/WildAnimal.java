package Inheritance;

public class WildAnimal extends Animal{
	
	@Override
	public void walk() {
		System.out.println("WildAnimal-------walk");
	}
	
	public static void drink() {
		System.out.println("WildAnimal------drinking");
	}

}
