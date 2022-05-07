package JavaSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class swapTest {

	public static void main(String[] args) {
		ArrayList<String> roles= new ArrayList<String>(Arrays.asList("Manager", "Executive", "Product Manager", "Supervisor"));
		
roles.forEach(rolesdata -> System.out.println(rolesdata));
System.out.println("++++++++++++++++++++++++++++++++");
Collections.swap(roles, 2, 1);

for(String s : roles) {
	System.out.println(s);
}


	}

}
