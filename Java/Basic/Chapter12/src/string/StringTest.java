package string;

public class StringTest {
	public static void main(String[] args) {
		String name1 = new String("asd");
		String name2 = new String("asd");

		System.out.println(name1 == name2);// ���޸𸮶� �ּҰ� �ٸ�
		System.out.println(name1.equals(name2));// equals�� �̹� ������

		String name3 = "abdf";
		String name4 = "abdf";

		System.out.println(name3 == name4);// �޸𸮰� ���Ǯ�� ��ġ
		System.out.println(name3.equals(name4));

	}

}
