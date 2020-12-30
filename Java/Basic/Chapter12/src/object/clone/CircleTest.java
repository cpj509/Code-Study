package object.clone;

public class CircleTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(3, 4, 5);
        System.out.println(circle);

        //객체 복사 - clone()
        Circle circle2 = (Circle) circle.clone();
        System.out.println(circle2);
    }
}
