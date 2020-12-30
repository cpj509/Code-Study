package object.equals;

public class EqualsTest {
    public static void main(String[] args) {
        //String의 인스턴스 비교
        String name1 = new String("asd");
        String name2 = new String("asd");

        //메모리 주소 동일 여부
        System.out.println(name1==name2);//false

        //문자열 값 동일 여부
        System.out.println(name1.equals(name2));//true

        //Book의 인스턴스 비교
        Book book1 = new Book(101, "qwe");
        Book book2 = new Book(101, "qwe");

        System.out.println(book1 == book2);//false
        System.out.println(book1.equals(book2));//원래 false인데 override를 통해서 true로.
    }
}
