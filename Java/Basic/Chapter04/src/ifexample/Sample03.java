package ifexample;

import java.util.Scanner;

public class Sample03 {

	public static void main(String[] args) {
		// if, else if, else
		Scanner scan = new Scanner(System.in);
		System.out.print("Input age : ");
		int age = scan.nextInt();
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
			System.out.println("Class 1");
		}
		else if(age >= 8 && age < 14) {
			charge = 2000;
			System.out.println("Class 2");
		}
		else if(age >= 14 && age < 20) {
			charge = 2500;
			System.out.println("Class 3");
		}
		else {
			charge = 3000;
			System.out.println("Class 4");
		}
		System.out.println("Charge : " + charge);
		scan.close();
	}

}
