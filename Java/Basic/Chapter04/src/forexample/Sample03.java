package forexample;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		int i;
		for (i = 1; i < 10; i++) {
			System.out.println(dan * i);
		}
		scan.close();

	}

}
