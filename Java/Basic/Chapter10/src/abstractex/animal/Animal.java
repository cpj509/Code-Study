package abstractex.animal;

public abstract class Animal {
    public void eat(){
        System.out.println("먹는다.");
    }
    public void sleep(){
        System.out.println("잠을 잔다.");
    }
    public abstract void cry();//abstract method
}
