package LocalDemo;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {
	
	public static void main(String[] args) {
		
		ResourceBundle bundleeeE = ResourceBundle.getBundle("msgs", Locale.of("de"));
		System.out.println(bundleeeE.getString("greeting"));
		System.out.println(bundleeeE.getString("message"));
		
		ResourceBundle bundleee = ResourceBundle.getBundle("msgs", Locale.of("hi"));
		System.out.println(bundleee.getString("greeting"));
		System.out.println(bundleee.getString("message"));
		
		
		ResourceBundle bundle = ResourceBundle.getBundle("msgs");
		System.out.println(bundle.getString("greeting"));
		System.out.println(bundle.getString("message"));
		
		ResourceBundle bundlee = ResourceBundle.getBundle("msgs" , Locale.FRANCE);
		System.out.println(bundlee.getString("greeting"));
		System.out.println(bundlee.getString("message"));
	
	}

}
