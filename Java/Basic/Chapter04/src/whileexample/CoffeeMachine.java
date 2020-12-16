package whileexample;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int coffee = 5;

		while (true) {
			System.out.print("Insert coin : ");
			int money = scan.nextInt();
			if (money == 500) {
				System.out.println("Wait your coffee.....");
				coffee -= 1;
			} else if (money > 500) {
				System.out.println("Wait your change and coffee...." + (money - 500));
				coffee -= 1;
			} else if (money < 500) {
				System.out.println("Insert money over 500.");
			}
			System.out.println("Coffee : " + coffee);
			if (coffee == 0)
				break;
		}
		scan.close();

	}

}
