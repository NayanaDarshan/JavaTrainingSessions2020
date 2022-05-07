package BasicsPrograms;

public class fibonnaciSeries {
	
	public static void main(String[] args) {
		int num=10;
		int firstterm=0;
		int secondterm=1;
		int nextterm=0;
		
		for(int i=1; i<=num; i++) {
			System.out.println(firstterm);
			nextterm= firstterm+secondterm;
		     firstterm=secondterm;
		     secondterm=nextterm;
		 
		
		}
System.out.println(nextterm);
	}

}
