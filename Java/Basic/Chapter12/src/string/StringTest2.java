package string;

public class StringTest2 {
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");

		System.out.println(javaStr);
		System.out.println("처음 문자열의 주소 값 : " + System.identityHashCode(javaStr));

		// 문자열 연결 - concat()
		javaStr = javaStr.concat(androidStr);

		System.out.println();
		System.out.println("병합된 문자열 주소의 값 : " + System.identityHashCode(javaStr));

	}

}
