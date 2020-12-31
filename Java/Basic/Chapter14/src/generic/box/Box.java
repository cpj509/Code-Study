package generic.box;

public class Box {
    private Object obj;//모든 자료를 저장할 멤버 변수 선언

    public Object get(){
        return obj;
    }

    public void set(Object obj){
        this.obj = obj;
    }
}
