package string;

public class StringBuilderTest {
	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javaStr�� �ּ� �� : " + System.identityHashCode(javaStr));

		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("���� �� buffer�� �޸� �ּ� : " + System.identityHashCode(buffer));
		// ���ڿ� �߰�
		buffer.append(" and");
		buffer.append(" anddroid");
		buffer.append(" programming is fun");
		System.out.println(buffer);
		System.out.println("���� �� buffer�� �޸� �ּ� : " + System.identityHashCode(buffer));

	}

}
