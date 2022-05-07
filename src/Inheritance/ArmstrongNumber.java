package Inheritance;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int number=153;
		
		int c=0;
		
		int a, temp;
		
		temp=number;
		
		while(number>0) {
			
			a=number%10;
			
			number=number/10;
			
			c= c+(a*a*a);
		}
			if(temp==c) {
				System.out.println("The number is Armsstrong");
			}
					
			else {
				System.out.println("The number is NOT Armsstrong");
			}
			
		}
	}


