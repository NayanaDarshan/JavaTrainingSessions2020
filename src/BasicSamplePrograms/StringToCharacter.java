package BasicSamplePrograms;

public class StringToCharacter {

	public static void main(String[] args) {
		String name = "Nayana";
		
		char[] str=name.toCharArray();
		
		for(char c: str) {
			System.out.println(c);
		}
	}

}
