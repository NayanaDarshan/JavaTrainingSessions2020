package JavaSession;

import java.util.Scanner;

public class TArrays {

	public static void main(String[] args) {
		
		TArrays ta = new TArrays();
		
		ta.pyramid(5);
		int a[]= new int[5];
		
		a[0]=20;
		a[1]=30;
		a[3]=-60;
		System.out.println(a[3]);
		
		int b[] = {67,68, 90, 100};
		
		/*
		 * System.out.println(b[1]);
		 * 
		 * for (int p=0; p<b.length; p++) { System.out.println(b[p]); }
		 */
		
		/*
		 * int p=0;
		 * 
		 * while(p<b.length) {
		 * 
		 * System.out.println(b[p]); p++; }
		 */
		
		for ( int h :b) {
			System.out.println(h);
		}
		
		
		  Object empdata[] = new Object[5]; 
		  empdata[0]= "Nayana"; 
		  empdata[1] =34;
		  empdata[2]="28/07/1986"; 
		  empdata[3]='f'; 
		  empdata[4]=66.90;
		  //empdata[5]="abc";
		  
		 
		/** for ( int m =0; m< empdata.length; m++) { System.out.println(empdata[m]); }
		
		 
		 * int m=0;
		 * 
		 * while(m<empdata.length) {
		 * 
		 * System.out.println(empdata[m]); m++;
		 * 
		 * }
		 */
		
		for (Object nayanadata : empdata) {
			System.out.println(nayanadata);
		}
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the choice of Car===> 1. SUV 2.Sedan 3.Alto 4.Brio 5. Invalid choice" );
		
		int choice = scan.nextInt();
		
		switch (choice){
			
			case 1: 
				System.out.println(" The selected car is: "+"SUV" );
				break;
				
			case 2:
				System.out.println("The selected car is: "+"Sedan");
				break;
				
			case 3:
				System.out.println("The selected car is: "+"Alto");
				break;
				
			case 4:
				System.out.println("The selected car is: "+"Brio");
				break;
			
			default: 
				System.out.println("It's an invalid choice");
				break;
				
		}
		
		//Pattern programs
		
		
		
		
	}


public void pyramid(int n) {
	int i;
	
	for (i=0; i<5; i++) {
		System.out.println(" ");
	}
	 
	for ( int j=0; j<=i; j++) {
		System.out.println("**** ");
	}

	System.out.println();
}




}