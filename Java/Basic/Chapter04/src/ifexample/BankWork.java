package ifexample;

import java.util.Scanner;

public class BankWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int balance = 0;
		boolean run = true;

		System.out.println("-------------------------------------");
		System.out.println("1.deposit 2.withdraw 3.balance 4.exit");
		System.out.println("-------------------------------------");

		while (run) {
			System.out.println("select > ");
			int selNum = scan.nextInt();
			if (selNum == 1) {
				System.out.println("deposit money > ");
				int money = scan.nextInt();
				balance += money;
			} else if (selNum == 2) {
				System.out.println("withdraw money > ");
				int money = scan.nextInt();
				if (money > balance) {
					System.out.println("Your poor. You not have enough money.");
					continue;
				}
				balance -= money;
			} else if (selNum == 3) {
				System.out.println("your balance > " + balance);
			} else if (selNum == 4) {
				run = false;
			} else {
				System.out.println("Please input valid number.");
			}
		}
		System.out.println("Complete");
		scan.close();
	}

}
