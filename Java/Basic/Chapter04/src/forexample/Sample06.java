package forexample;

public class Sample06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		for (i = 1; i <= 7; i++) {
			for (j = 1; j <= 7 - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

	}

}
