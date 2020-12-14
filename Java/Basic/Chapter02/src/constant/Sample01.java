package constant;

public class Sample01 {

	public static void main(String[] args) {
		// use constant
		int age = 15;
		final int MAX = 100;	// final이 붙으면 상수
		final int MIN = 1;
		
		age = 16;
//		MAX = 1000;
//		MIN = -1;
		System.out.println("Age : " + age);

	}

}
