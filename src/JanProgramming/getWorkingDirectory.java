package JanProgramming;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class getWorkingDirectory {

	public static void main(String[] args) {
		
		String directorypath=System.getProperty("user.dir");
		System.out.println("The current path is ===>" +directorypath);
		
		String dateformat= "2022-1-13";
		
		LocalDate localdate = LocalDate.parse(dateformat, DateTimeFormatter.ISO_DATE);
		
		System.out.println(localdate);

	}

}
