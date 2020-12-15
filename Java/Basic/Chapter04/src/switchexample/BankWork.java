package switchexample;

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
			int money = 0;
			switch (selNum) {
			case 1:
				System.out.println("deposit money > ");
				money = scan.nextInt();
				balance += money;
				break;

			case 2:
				System.out.println("withdraw money > ");
				money = scan.nextInt();
				if (money > balance) {
					System.out.println("Your poor. You not have enough money.");
					continue;
				}
				balance -= money;
				break;

			case 3:
				System.out.println("your balance > " + balance);
				break;

			case 4:
				run = false;
				break;
			default:
				System.out.println("please enter 1~4 number!!!");

			}
		}
		System.out.println("Complete");
		scan.close();
	}

}
