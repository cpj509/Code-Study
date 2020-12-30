package exception;

public class ThrowsException {
    //예외 처리 미루기
    public Class loadClass(String className) throws ClassNotFoundException {
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("java.lang.String");//호출할 때 예외 처리(try ~ catch)
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("수행 완료");

    }
}
