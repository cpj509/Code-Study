package regex;

import java.util.regex.Pattern;

public class RegExTest2 {

	public static void main(String[] args) {
		// ���� ǥ���� �����ϱ�
		String pattern = "^[0-9]*$";	//���� ǥ����(����)
		String value = "abc2021";	//��Ī ���ڿ�
		String value2 = "2021";	//��Ī ���ڿ�
		
		boolean a = Pattern.matches(pattern, value);
		boolean b = Pattern.matches(pattern, value2);
		 
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("===============");
		
		String name = "�������";
		
		boolean name_check = Pattern.matches("^[��-�R]*$", name);
		
		System.out.println(name_check);
		
		

	}
	

}
