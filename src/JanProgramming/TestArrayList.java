package JanProgramming;

import java.util.ArrayList;
import java.util.Arrays;

public class TestArrayList {

	public static void main(String[] args) {
	ArrayList<String> months = new ArrayList<String>(Arrays.asList("Jan", "Feb", "March", "April"));
	
	ArrayList<String> days = new ArrayList<String>(Arrays.asList("Sunday","Monday","Tuesday", "Wednesday"));
	System.out.println("************************************************");
	days.stream().forEach(ele-> System.out.println(ele));
    System.out.println("*****************************************************");     
	
	//months.addAll(days);
	
	months.addAll(2, days);
	
	System.out.println(months);
	
	days.clear();
	
	System.out.println(days);
	
	ArrayList<String> newlist =(ArrayList<String>)months.clone();
	
	System.out.println(newlist);
	
	System.out.println(newlist.size());
	System.out.println(months.remove("Nayana"));

	System.out.println(months);
	
	System.out.println(months.lastIndexOf("Nayana"));
	}
	

}
