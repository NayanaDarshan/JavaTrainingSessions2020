package Interface;

public interface UKCountry {
	
	public void bankRules();
	
	public void govtPolicy();
	
	public void minBalance();

	
	public void maxBalance();
	
	public default void  ageCriteria() {
		System.out.println("The age should be above 18");
	}
}
