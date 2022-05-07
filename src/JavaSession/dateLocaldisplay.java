package JavaSession;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class dateLocaldisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate mylocaldate =  LocalDate.now();
		
		System.out.println(mylocaldate);
		LocalTime mylocaltime = LocalTime.now();
		
		System.out.println(mylocaltime);
		
		LocalDateTime mylocaldatetime=LocalDateTime.now();
		
		System.out.println("Before formating");
		
		System.out.println(mylocaldatetime);

		DateTimeFormatter formatedate = DateTimeFormatter.ofPattern("dd-mm-yyy hh:mm:ss");
		
		String newlyformatteddate= mylocaldatetime.format(formatedate);
		
		System.out.println(newlyformatteddate);
	}

}
