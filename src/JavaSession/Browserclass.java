/*2. Design a browser class template with the following features:
 variables:
browserName
vendorName
currentVersion
List of plugins supported by Browser in Array List<String>

--Design the constructor of this class with different parameters and all parameters.

--Write the get method of each variable with return keyword. 
*/

package JavaSession;

import java.util.ArrayList;

public class Browserclass {
	String browserName;
	String vendorName;
	double currentVersion;
	ArrayList<String> pluginNames;

	public Browserclass(String browserName) {
		this.browserName = browserName;

	}

	public Browserclass(String browserName, String vendorName) {

		this.browserName = browserName;
		this.vendorName = vendorName;
	}

	public Browserclass(String browserName, double currentVersion) {

		this.browserName = browserName;
		this.currentVersion = currentVersion;
	}

	public Browserclass(String browserName, String vendorName, double currentVersion, ArrayList<String> pluginNames) {
		this.browserName = browserName;
		this.vendorName = vendorName;
		this.currentVersion = currentVersion;
		this.pluginNames = pluginNames;
	}

	public static void main(String[] args) {
		Browserclass bcn = new Browserclass("Internet Explorer (IE)");
		System.out.println("--------Constructor with  1 Parameter value------");
		System.out.println(bcn.getBrowserName());
		
		
		Browserclass bc1 = new Browserclass("Firefox", "Firefox Inc");
		System.out.println("-------------Constructor with 2 Parameter value--------");
		System.out.println(bc1.getBrowserName());
		System.out.println(bc1.getVendorName());
		
		Browserclass bc2 = new Browserclass("Opera", 35.608);
		System.out.println("-------------Constructor with 2 different type Parameter value--------");
		System.out.println(bc2.getBrowserName());
		System.out.println(bc2.getcurrentVersion());
		
		ArrayList<String> pluginList = new ArrayList<String>();

		pluginList.add("Chropath");
		pluginList.add("Firebug");
		pluginList.add("RESTED");
		pluginList.add("CISCO Plugin");
        
		System.out.println("-------Constructor with all parameter values-----------------------------");
		Browserclass bc = new Browserclass("Chrome", "Google Inc", 83.0, pluginList);

		System.out.println(bc.getBrowserName());
		System.out.println(bc.getcurrentVersion());
		System.out.println(bc.getVendorName());

		System.out.println("-----Plugin List details is as below------");
		ArrayList<String> plist = bc.getPlugin();
		plist.stream().forEach(System.out::println);

	}

	public String getBrowserName() {
		return browserName;
	}

	public String getVendorName() {
		return vendorName;
	}

	public double getcurrentVersion() {
		return currentVersion;
	}

	public ArrayList<String> getPlugin() {

		return pluginNames;
	}
}
