package generic.threedprinter;

public class GenericPrinter<T> {
    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    //재정의가 아니고 Plastic클래스의 toString method call
    public String toString() {
        return material.toString();
    }
}
