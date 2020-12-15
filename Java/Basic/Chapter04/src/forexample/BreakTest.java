package forexample;

public class BreakTest {

	public static void main(String[] args) {
		// sum 1~100 integer
		int n = 1;
		int sum = 0;
		while (true) {
			sum += n;
			if (sum > 100)
				break;
			n++;
		}
		System.out.println(n);
		System.out.println(sum);

	}

}
