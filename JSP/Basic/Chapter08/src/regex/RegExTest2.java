package regex;

import java.util.regex.Pattern;

public class RegExTest2 {

	public static void main(String[] args) {
		// Á¤±Ô Ç¥Çö½Ä ¿¬½ÀÇÏ±â
		String pattern = "^[0-9]*$";	//Á¤±Ô Ç¥Çö½Ä(ÆÐÅÏ)
		String value = "abc2021";	//¸ÅÄª ¹®ÀÚ¿­
		String value2 = "2021";	//¸ÅÄª ¹®ÀÚ¿­
		
		boolean a = Pattern.matches(pattern, value);
		boolean b = Pattern.matches(pattern, value2);
		 
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("===============");
		
		String name = "¼¼Á¾´ë¿Õ";
		
		boolean name_check = Pattern.matches("^[±â-ÆR]*$", name);
		
		System.out.println(name_check);
		
		

	}
	

}
