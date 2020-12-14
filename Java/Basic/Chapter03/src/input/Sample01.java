package input;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		// 입력 처리
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What's your name?");
		String name = sc.nextLine();	//점(.)연산자로 접근하여 함수(메서드)를 사용한다.
		
		System.out.println("Your name is " + name);
		
		System.out.println("How old?");
		int age = sc.nextInt();
		System.out.println("Your age is " + age);
		
		sc.close();

	}

}
