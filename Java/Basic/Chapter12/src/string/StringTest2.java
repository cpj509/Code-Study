package string;

public class StringTest2 {
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");

		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ��� �ּ� �� : " + System.identityHashCode(javaStr));

		// ���ڿ� ���� - concat()
		javaStr = javaStr.concat(androidStr);

		System.out.println();
		System.out.println("���յ� ���ڿ� �ּ��� �� : " + System.identityHashCode(javaStr));

	}

}
