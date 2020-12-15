package whileexample;

import java.util.Scanner;

public class Sample04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("Y/N");
			String answer = scan.nextLine();
			
			if(answer.equals("y") || answer.equals("Y")) {
				System.out.println("continue loop");
			}
			else if(answer.equals("n") || answer.equals("N")) {
				System.out.println("stop loop");
				break;
			}
			else {
				System.out.println("please enter 'y' or 'n'");
			}
		}
		System.out.println("program end");
		scan.close();

	}

}
