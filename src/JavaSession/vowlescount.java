package JavaSession;

import java.util.LinkedHashMap;

public class vowlescount {

	public static void main(String[] args) {
		
		String str= "AAAIEOU";
		
		int length =str.length();
		
		int count;
		
		LinkedHashMap<Character, Integer> hashMap = new LinkedHashMap<Character, Integer>();
		
		hashMap.put('A', 0);
		hashMap.put('E', 0);
		hashMap.put('I', 0);
		hashMap.put('O', 0);
		hashMap.put('U', 0);
		
		for (int i=0; i<=length-1; i++) {
			if(hashMap.containsKey(str.charAt(i))) {
				count=hashMap.get(str.charAt(i));
				hashMap.put(str.charAt(i), ++count);
				
			}
			
		}
		System.out.println(hashMap);
	}

}
