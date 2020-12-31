package generic.box2;

public class Box<T> {//파라미터(매개변수)가 자료형
    private T type;
    public void set(T type){
        this.type = type;
    }
    public T get(){
        return type;
    }
}
