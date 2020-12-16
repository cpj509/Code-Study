package forexample;

public class StarPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 7;
		int star = 1;
		int space = row;
		int i, j;

		for (i = 1; i <= row; i++) {
			for (j = 1; j < space; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if (i <= row / 2) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
			System.out.println();
		}

	}

}
