package Inheritance;

public class AnimalBreed {

	public static void main(String[] args) {
		Cow cw= new Cow();
		cw.walk();
		cw.Milk();
		cw.Sound();
		cw.sleep();
		cw.run();
		
		System.out.println("*********************************************");
	
	   Animal an =new Cow();	
	   an.walk();
	   an.sleep();
	   an.run();
	   
	   System.out.println("==================================");
	   DomesticAnimal dm = new DomesticAnimal();
	   dm.walk();
	   dm.sleep();
	   dm.Sound();
	   
	   
	   
	   //Top-Casting -- Child class object is referred by parent class Object reference variable
	   System.out.println("*****************************************");
	    Animal an1=new DomesticAnimal();
	    an1.walk();
	    an1.sleep();
	    Animal.run();
	    
	    
	    //Down-Casting-- Class cast exception
	    
	DomesticAnimal dm2= (DomesticAnimal) new Animal();
	dm2.sleep();
	    

	}

}
