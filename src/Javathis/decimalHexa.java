package Javathis;

import java.util.Scanner;

public class decimalHexa {

	public static void main(String[] args) {
		
		int dec_num;
		
		int temp;
		
		String hex_num=" ";
		
		int rem;
		
		char hexa[]= {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E'};
		
		
      Scanner scn = new Scanner(System.in);
      
      System.out.println("please enter the number");
       dec_num=scn.nextInt();
       
       while(dec_num!=0) {
    	   
    	 rem= dec_num%16;
    	 hex_num=hexa[rem]+hex_num;
    	 dec_num=dec_num/16; 
    	 
    	 
       }
      
       System.out.println(hex_num);
      
      
	}

}
