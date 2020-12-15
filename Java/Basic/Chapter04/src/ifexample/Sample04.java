package ifexample;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input first number : ");
		int n1 = scan.nextInt();
		System.out.print("Input second number : ");
		int n2 = scan.nextInt();
		
		int max;
		
//		max = (n1 > n2) ? n1 : n2;
		if(n1 > n2) {
			max = n1;
		}
		else {
			max = n2;
		}
		System.out.println("Max number : " + max);
		
		
		scan.close();

	}

}
