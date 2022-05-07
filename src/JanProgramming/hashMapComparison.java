package JanProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class hashMapComparison {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hmap1 = new HashMap<Integer, String>();

		hmap1.put(1, "Nayana");
	
		hmap1.put(2, "Smira");
		
		hmap1.put(3, "Sharvika");
		
		hmap1.put(4, "Smaya");
		
	
	HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();

	hmap2.put(1, "Nayana");

	hmap2.put(2, "Smira");
	
	hmap2.put(3, "Sharvika");
	
	hmap2.put(4, "Smaya");
	
	hmap2.forEach((k,v)-> System.out.println(k + v));
	
	System.out.println(hmap1.equals(hmap2));
	
	System.out.println(hmap1.values().equals(hmap2.values()));
	
	List<String> ar= new ArrayList<String>(hmap1.values());
	
	ar.stream().forEach(ele-> System.out.println(ele));
	
    List<String> ar1= new ArrayList<String>(hmap2.values());
	
	ar1.stream().forEach(ele-> System.out.println(ele));
}
	
	

}
