package JavaSession;

import java.util.HashMap;

public class charMao {

	public static void main(String[] args) {
		String name = "aeiuuuo";
		
		int len =name.length();
		
		int count;
		
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
		
		for( int i= len-1; i>=0; i--) {
			
			if(hmap.containsKey(name.charAt(i))) {
				
				count= hmap.get(name.charAt(i));
				
				hmap.put(name.charAt(i), ++count);
			}
			
			else {
				hmap.put(name.charAt(i), 1);
			}
		}
		
				System.out.println(hmap);
	}

}
