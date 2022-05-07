package JavaSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		
		
		
		ArrayList<Integer> num123 = new ArrayList<Integer>(Arrays.asList(2000, 3000, 400));
		
		System.out.println("The numbers are ===>" +num123);
		// 1. Write a Java program to create a new array list, add some colors (string)
		// and print out the collection
		System.out.println("****************************************************************");

		ArrayList<String> colors = new ArrayList<String>();
		colors.add("Red");
		colors.add("Blue");
		colors.add("Purple");
		colors.add("Green");
		colors.add("Pink");
		colors.add("white");
        colors.ensureCapacity(20);
		System.out.println("All entered colors are is as below");
		for (String Allcolors : colors) {
		//	colors.trimToSize();
			System.out.println(Allcolors);
			
			
		}
		
		
		
		colors.forEach(clr ->System.out.println(clr));
		
		colors.stream().forEach(System.out::println);
		
		System.out.println("****************************************************************");
		// 2. Write a Java program to insert an element into the array list at the first
		// and last positions.

		// 3. Write a Java program to retrieve an element (at a specified index) from a
		// given array list.

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(40);
		ar.add(50);
		ar.add(60);
		ar.add(06, 100);
		
		
		
		ar.forEach(ar10 -> System.out.println(ar10));
		
		ar.stream().forEach(System.out::println);
		
		System.out.println("The values of an array are===>"+ar);
	
		System.out.println("The arraylist value at 1st position " + ar.get(0));
		System.out.println("The arraylist value at last position " + ar.get(5));

		System.out.println("**********************************************************");
		// 4. Write a Java program to update specific array element by given element.

		ArrayList<Integer> ar3 = new ArrayList<Integer>();

		ar3.add(100);
		ar3.add(200);
		ar3.add(300);
		ar3.add(400);
		ar3.add(500);
       
		
		System.out.println("Before update value  ====> "+ar3);
        //updated the 1st Index value
		ar3.set(1, 700);
		System.out.println("After update value at 1 index=====>" + ar3);

		System.out.println("**********************************************************");

		// 5. Write a Java program to remove the third element from a array list.

		ArrayList<Integer> a10 = new ArrayList<Integer>();
		a10.add(1);
		a10.add(2);
		a10.add(3);
		a10.add(4);
		a10.add(5);

		System.out.println("**********Before removal*******************");
		System.out.println(a10);

		System.out.println("Remove number==>" + a10.remove(2));

		System.out.println("**********After removal*******************");
		System.out.println(a10);
		
		// 6. Write a Java program to search an element in a array list.

		ArrayList<String> as = new ArrayList<String>();

		as.add("Java");
		as.add("Qtp");
		as.add("Selenium");

		for (int y = 0; y < as.size(); y++) {

			if (as.get(y).equalsIgnoreCase("java")) {

				System.out.println("The value is found====>" + as.get(y));
			}

		}

		// 7. Write a Java program to reverse elements in a array list

		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(10);
		num.add(22);
		num.add(33);
		System.out.println("The reverse set of elements is as below");

		for (int w = num.size() - 1; w >= 0; w--) {

			System.out.println(num.get(w));
		}

		// 8. Write a Java program to extract a portion of a array list.
		ArrayList<String> names = new ArrayList<String>();

		names.add("Nayana");
		names.add("Smira");
		names.add("Darshan");
		names.add("Asha");
		names.add("Dolo");
		names.add("Raghu");

		System.out.println("The original list===>" + names);
		
		names.forEach(newnames -> System.out.println(newnames));
		names.stream().forEach(System.out::println);

		List<String> sublist1 = new ArrayList<String>();

		sublist1 = names.subList(0, 2);
		System.out.println(names.subList(2, 4));

		System.out.println("The extracted list====>" + sublist1);

		// 9. Write a Java program of swap two elements in an array list.

		for (String bswap : names) {
			System.out.println(bswap);

		}
		
		

		System.out.println("------After swap------");
		Collections.swap(names, 4, 2);

		for (String aswap : names) {
			System.out.println(aswap);

		}
		
		names.forEach(nam1 -> System.out.println(nam1));
		names.stream().forEach(System.out::println);
		
		System.out.println("***********************************************");

		// 10. Write a Java program to empty an array list.

		ArrayList<String> colors1 = new ArrayList<String>();
		
		colors1.add("Red");
		colors1.add("Yellow");
		colors1.add("Green");
		colors1.add("white");
		System.out.println("Before removal====>" +colors1);
		
		colors1.removeAll(colors1);
		
		System.out.println("After removal/Empty====>" +colors1);
		
		System.out.println("***********************************************");
		
//11. Write a Java program to trim the virtual capacity of an array list the current list size.
		System.out.println(" 11 *************************************************");
		ArrayList<String> ar15 = new ArrayList<String>();

		
		ar15.add("AA");
		ar15.add("BB");
		ar15.add("CC");
		ar15.add("DD");
		ar15.add("EE");
		ar15.ensureCapacity(3);
	
	
	
		System.out.println(ar15.size());
		
		ar15.forEach(ar17 -> System.out.println(ar17));
		
		
//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
		
		for ( int k =0; k<colors.size(); k++) {
			System.out.println(" The position is: " +k +" and values is " +colors.get(k));
		}
		
		colors.forEach(af -> System.out.println(af));
		colors.stream().forEach(System.out::println);
	}
	

}