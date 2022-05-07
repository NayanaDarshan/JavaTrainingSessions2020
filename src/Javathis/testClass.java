package Javathis;

public class testClass {

	public static void main(String[] args) {
		
		String name = "Nayana";
		
		String name1= new String("Nayana");
		
		System.out.println(name.equalsIgnoreCase(name1));
		
		System.out.println(name==name1);

		System.out.println(name.compareTo(name1));
		
		System.out.println(name.substring(0, 3));
		System.out.println(name.substring(3));
		
		name.intern();
	}

}
