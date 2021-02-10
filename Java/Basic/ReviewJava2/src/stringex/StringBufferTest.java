package stringex;

public class StringBufferTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("javaStr의 주소 : " + System.identityHashCode(javaStr));

        StringBuffer buffer = new StringBuffer(javaStr);
        System.out.println("연산 전 buffer의 주소 : " + System.identityHashCode(buffer));

        //문자열 추가
        buffer.append(" and");
        buffer.append(" Android");
        buffer.append(" Programming is fun!!");

        System.out.println("연산 후 buffer의 주소 : " + System.identityHashCode(buffer));;
        System.out.println(buffer.toString());
    }
}
