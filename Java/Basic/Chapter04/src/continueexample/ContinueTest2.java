package continueexample;

public class ContinueTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (j % 2 != 0)
					continue;
				System.out.println(i + "x" + j + "=" + i * j);
			}
			System.out.println();
		}

	}

}
