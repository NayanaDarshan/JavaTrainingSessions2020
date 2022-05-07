package patternPackage;

public class classExam {
	

    static String name;
    static int age;
    static Address address;
    
    static final String panCardName;
    
    
    static {
    	panCardName="Nayana M.R";
    }
    public classExam( String name, int age, Address addr) {
    
		this.name=name;
		this.age= age;
		this.address=addr;
		
	}
	


	public static void main(String[] args) {
		
		
		Address addr= new Address("ABC", "Banglore", "Banglore");

		classExam obj = new classExam("Nayana", 34,addr);
		
		System.out.println(panCardName);
		System.out.println("Name is==>" +name);
		
		System.out.println("Address is ==>" +addr.district);
		
	}
	
	
	

}
