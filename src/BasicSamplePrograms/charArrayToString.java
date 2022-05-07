package BasicSamplePrograms;

public class charArrayToString {

	public static void main(String[] args) {
    char[] ch= {'a', 'b', 'c', 'd'};
    
    String strnew= String.valueOf(ch, 0,ch.length);
    
    System.out.println(strnew);

System.out.println(strnew.subSequence(0, 3));
  
  
  
	}

}
