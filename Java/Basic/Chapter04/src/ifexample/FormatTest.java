package ifexample;

public class FormatTest {

	public static void main(String[] args) {
		int year = 2020;
		System.out.println(year);
		System.out.printf("%d\n", year);

		int money = 10000;
		System.out.printf("%,d¿ø\n", money);

		float pi = 3.1415F;
		System.out.printf("%f\n", pi);

		String name = "asdf";
		System.out.printf("%s", name);

	}

}
