package input;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		// �Է� ó��
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = sc.nextLine();	//��(.)�����ڷ� �����Ͽ� �Լ�(�޼���)�� ����Ѵ�.
		
		System.out.println("Your name is " + name);
		
		System.out.println("How old?");
		int age = sc.nextInt();
		System.out.println("Your age is " + age);
		
		sc.close();

	}

}
