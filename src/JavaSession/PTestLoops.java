package JavaSession;

public class PTestLoops {

	public static void main(String[] args) {

		int i = 100;

		while (i <= 200) {
			System.out.println(i);
			i++;
		}
		System.out.println("The characters are printed from a-z");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			
			System.out.println(ch);
		}

		
		for (double d=1.2; d<=9.4; d++) {
			System.out.println(d);
		}
	     

		for(int j=20;j<=20;j++) {
			System.out.println("nayana");
		}

		String str= "Nayana";
		
		System.out.println(str.indexOf("a"));
		System.out.println(str.indexOf("a", str.indexOf("a")+1));
		System.out.println(str.substring(str.indexOf("ay")+2));
	}
}
