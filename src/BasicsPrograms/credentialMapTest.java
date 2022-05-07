package BasicsPrograms;

import java.util.HashMap;

public class credentialMapTest {

	public static void main(String[] args) {
		
		HashMap<String, String> credMap = new HashMap<String, String>();
		
		credMap.put("customer", "nayana@gmail.com:password01");
		credMap.put("seller", "smira@gmail.com:password02");
		credMap.put("Adminuser", "admin@gmail.com:password03");

		credentialMapTest objcred= new credentialMapTest();
		
		String usercredentials= credMap.get("customer");
		
		String userName=usercredentials.split(":")[0].trim();
		
		String password=usercredentials.split(":")[1].trim();
		
		objcred.doLogin(userName, password);
	
		objcred.doLogin(credMap.get("seller").split(":")[0].trim(), credMap.get("seller").split(":")[1].trim());
	}

	public void doLogin(String username, String password) {
	   System.out.println(username+"============"+password);
	}
}
