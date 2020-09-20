package Interface;


public class AxisBank implements UKCountry, IndiaCountry, USCountry{

	@Override
	public void bankRules() {
		System.out.println("Axis Bank=====rule declaration");
		
	}

	@Override
	public void govtPolicy() {
		System.out.println("Axis Bank=====Test declaration");
		
		
	}

	@Override
	public void minBalance() {
		System.out.println("Axis Bank=====minimum declaration" + 1000);
		
		
	}

	@Override
	public void depositCriteria() {
		System.out.println("Axis Bank=====deposit declaration" + 2000);
		
	}

	@Override
	public void maxBalance() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
   	public void ageCriteria () {
   		System.out.println("The age criteria above 18 years");
   	}

	@Override
	public void rbiGuidelines() {
		System.out.println("The RBI axis bank guidelines");
		
	}
    
	public void withdraw() {
		System.out.println("Axis bank =====withdraw");
	}
}
