package TestCode;

import java.util.Scanner;

public class commonDigit {

	public static void main(String[] args) {
		System.out.println("Please enter number1");
		Scanner scn = new Scanner(System.in);
		
		int num1 =scn.nextInt();
		
		System.out.println("Please enter number 2");
		
		Scanner scn1= new Scanner(System.in);
		
		int num2=scn.nextInt();
		
	   System.out.println("Result:" +common_digit(num1, num2));  

	}

	static public boolean(int a int)
	public static boolean common_digit(int p, int q) {
		
		if(p<25 || q>75) {
			return false;
			
		}
			else {
				int x= p%10; //5
				System.out.println(x);
				int y=p%10;//5
				
				System.out.println(y);
				
				p=p/10;
				System.out.println(p);
				q=q/10;
				System.out.println(q);
				
				return(p==q||p==y||x==q ||x==y);
			}
			
		
		
		

	}
}
