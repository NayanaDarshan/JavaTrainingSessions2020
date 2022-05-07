package JavaSession;

import java.util.HashMap;

public class credentialTest {

	static HashMap<String, String> credMap = new HashMap<String, String>();
	
	public static void main(String[] args) {
		
		credMap.put("customer", "nayana.mr@epicor.com;password01");
		credMap.put("seller", "smira.123@gmail.com;password02");
		
		credentialTest.doLogin(credMap.get("customer").split(";")[0].trim(), credMap.get("customer").split(";")[1].trim());
		credentialTest.doLogin(credMap.get("seller").split(";")[0].trim(), credMap.get("seller").split(";")[1].trim());
	
	for( String s : credMap.values()) {
		System.out.println("The values are email_____" + s);
	}
	
	}

	
	public static void doLogin( String username, String password) {
		
		System.out.println("The username is===>" +username);
		System.out.println("The password is ====>" +password);
	}

}
