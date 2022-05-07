package Javathis;

public class formatTest {

	public static void main(String[] args) {
		
		String name ="nayana Smira";
		
		String sf1= String.format("name is %s", name);
		
		System.out.println(sf1);
		
		
		byte[] barray =name.getBytes();
		
		for(int i=0; i<barray.length; i++) {
			
			System.out.println(barray[i]);
			
			
			StringBuffer sb = new StringBuffer("Darshan");
	
			
			System.out.println(sb.append(name));
			
			String delimiter = String.join("-", "Nayana","Darshan","Smira");
			
			System.out.println(delimiter);
			
			System.out.println(name.length());
			System.out.println(name.lastIndexOf('a'));
			
			System.out.println(name.lastIndexOf("na"));
			
			System.out.println(name.lastIndexOf('a', 4));
			
			String name1 =" Nayana Mandya Raghu";
			
			String sn[]=name1.split("//s");
			
			for(String sn1 : sn) {
				System.out.println(sn1.toString());
		}
			
		}
	}

}
