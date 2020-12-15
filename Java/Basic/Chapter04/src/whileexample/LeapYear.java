package whileexample;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// leap year.
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Input year : ");
			int year = scan.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || year % 4 == 0) {
				System.out.println(year + " is leap year");
				break;
			} else {
				System.out.println(year + " is not leap year");
			}
		}
		scan.close();

	}

}
