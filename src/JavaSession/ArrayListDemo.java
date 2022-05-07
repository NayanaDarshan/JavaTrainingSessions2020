package JavaSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		
		System.out.println(numbers);
		/*
		 * numbers.removeIf(num -> num%2==0);
		 * 
		 * System.out.println("After removing even numbers===>"+numbers);
		 */
		numbers.removeIf(num -> num%2==1);
		
		System.out.println("After removing odd numbers===>"+numbers);
		
	
	ArrayList<String> str = new ArrayList<String>(Arrays.asList("Nayana", "Smira", "Darshan","Smira"));
	
	System.out.println("Before retain all=> " +str);  
     str.retainAll(Collections.singleton("Smira"));
     
     System.out.println("Retain all===>" +str);
     
      
     ArrayList<String> str1 = new ArrayList<String>(str.subList(1, 2));
     
     System.out.println("The sublist is ===>"+str1);
     
     
     ArrayList<Integer> marks1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,5,7,8,9,10,11,11,12,13,14,15,15));    
     
     LinkedHashSet<Integer> mar = new LinkedHashSet<Integer>(marks1);
     
     ArrayList<Integer> removeduplicateMarks= new ArrayList<Integer>(mar);
     
     System.out.println("The non duplicated numbers are===>"+removeduplicateMarks);
     
     
     ArrayList<Integer> marks2 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,4,5,5,7,8,9,10,11,11,12,13,14,15,15)); 
     
     List<Integer> removeduplicateMarks1= marks2.stream().distinct().collect(Collectors.toList());
     removeduplicateMarks1.stream().forEach(ele -> System.out.println(ele));
     

     
     
     
	}	

	
	
	}


