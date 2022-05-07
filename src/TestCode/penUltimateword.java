package TestCode;

public class penUltimateword {

	public static void main(String[] args) {
		String str= "Nayana Mandya Raghu Smira";
		
		String[] strArr= str.split(" ");
		
		System.out.println("The penultimate word is:====>" +strArr[strArr.length-1]);
	}

}