package core;

// http://findbugs.sourceforge.net/index.html
// http://www.sw-engineering-candies.com/blog-1/findbugstmwarningsbysample-partii

public class Findbugs {

	// FinalParametersCheck
	@SuppressWarnings("null")
	public static boolean Aria(String name) {
		boolean nik = (Boolean) true;
		return nik;
	}
	
	// getSecurePassword
	static String getSecurePassword() {
		
		return "my-sec" + "ret-password";
	}

	static void abc() {	
		int xsio = 2;
		int yang = 5;
		double value1 =  xsio / yang;

	}

}
