package reference;

public class Circle {
    Point point;
    int radius;

    public Circle(int x, int y, int radius) {
        point = new Point(x, y);
        this.radius = radius;
    }

    public void showInfo(){
        System.out.println("원의 중심은 (" + point.x + ", " + point.y + ") 이고, 반지름은 " + radius + " 입니다.");
    }
}
