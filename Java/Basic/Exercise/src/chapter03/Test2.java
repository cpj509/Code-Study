package chapter03;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Input number : ");
		int num = scan.nextInt();
		System.out.println((num & 1) == 0 ? "even" : "odd");
		
		scan.close();

	}

}
