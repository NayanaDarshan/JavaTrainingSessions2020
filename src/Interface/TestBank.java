package Interface;

public class TestBank {

	
	public static void main(String[] args) {
		
		AxisBank ax = new AxisBank();
		
		ax.bankRules();
		ax.ageCriteria();
		ax.rbiGuidelines();
		System.out.println(ax.Balance);
		ax.withdraw();
	
		System.out.println("********************************************");
		
        UKCountry uk =new AxisBank();
        		uk.ageCriteria();
                uk.bankRules();
                uk.govtPolicy();
                uk.minBalance();
                uk.maxBalance();
                //withdraw not available due to reference type check
	}

}
