package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest {

	public static void main(String[] args) {
		// 정규 표현식 연습하기
		Pattern p = Pattern.compile("a*b"); 
		Matcher m = p.matcher("aaaab");
		
		boolean b1 = m.matches();
		System.out.println(b1);

	}

}
