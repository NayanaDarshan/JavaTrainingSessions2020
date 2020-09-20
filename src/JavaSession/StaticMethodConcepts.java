package JavaSession;

public class StaticMethodConcepts {

	String name;
	int age;
	
	public StaticMethodConcepts( String name, int age){
		this.name= name;
		this.age=age;
	}
	public static void main(String[] args) {
	     StaticMethodConcepts sm1 = new StaticMethodConcepts("Nayana",34);
	     StaticMethodConcepts sm2 = new StaticMethodConcepts("Smira",4);
	     StaticMethodConcepts sm3 = new StaticMethodConcepts("Darshan",34);
	     
	     System.out.println(sm1.name + " "+ sm1.age);
	     System.out.println(sm2.name + " "+ sm2.age);
	     System.out.println("--------------------------------");
	     sm1=sm2;
	     
	     System.out.println(sm1.name + " "+ sm1.age);
	     System.out.println(sm2.name + " "+ sm2.age);
	     sm2=sm3;
	     
	     System.out.println("--------------------------------");
	     
	     System.out.println(sm1.name + " "+ sm1.age);
	     System.out.println(sm2.name + " "+ sm2.age);
	     System.out.println(sm3.name + " "+ sm3.age);
	     
	     System.out.println("--------------------------------");
	     
	     sm3=sm1;
	     System.out.println(sm1.name + " "+ sm1.age);
	     System.out.println(sm2.name + " "+ sm2.age);
	     System.out.println(sm3.name + " "+ sm3.age);
	}

}
