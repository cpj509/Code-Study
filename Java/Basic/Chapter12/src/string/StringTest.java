package string;

public class StringTest {
	public static void main(String[] args) {
		String name1 = new String("asd");
		String name2 = new String("asd");

		System.out.println(name1 == name2);// 힙메모리라서 주소가 다름
		System.out.println(name1.equals(name2));// equals가 이미 재정의

		String name3 = "abdf";
		String name4 = "abdf";

		System.out.println(name3 == name4);// 메모리가 상수풀에 위치
		System.out.println(name3.equals(name4));

	}

}
