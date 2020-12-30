package object.clone;

public class Circle implements Cloneable {
    Point center;
    int radius;

    public Circle(int x, int y, int radius){
        center = new Point(x, y);
        this.radius = radius;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
