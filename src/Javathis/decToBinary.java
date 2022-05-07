package Javathis;

import java.util.Scanner;

public class decToBinary {

	public static void main(String[] args) {
		int dec_num;

		int temp;

		int i = 1;
		
		int[] bin_arr = new int[100];

		Scanner scn = new Scanner(System.in);

		System.out.println("Please enter the decimal number");
		dec_num = scn.nextInt();
		
		temp=dec_num;
		
		while(temp!=0) {
			
			bin_arr[i++]= temp%2;
			
			temp=temp/2;
			
		}
		for(int j=i-1; j>0; j--) {
			
			System.out.print(bin_arr[j]);
		}

		System.out.println("\n");
	}

}
