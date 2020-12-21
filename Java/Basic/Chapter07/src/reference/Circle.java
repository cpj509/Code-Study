package reference;

public class Circle {
    Point center;
    int radius;

    public Circle(int x, int y, int radius){
        center = new Point(x, y);
        this.radius = radius;
    }
    public void showInfo(){
        System.out.println("Center of Circle is " + center.x + ", " + center.y + " and radius is " + radius);
    }
}
