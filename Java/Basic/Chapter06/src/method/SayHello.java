package method;

//class는 괄호가 없음.
public class SayHello {
    //sayHello() method -> 반환 자료형이 없음.(void)
    public static void sayHello(){
        System.out.println("Hello~ ");
    }
    //sayHello2() method -> 매개 변수가 있는 메소드. static은 new가 없으면 사용해야함.
    public static void sayHello2(String name){
        System.out.println("Hello~ " + name);
    }
    public static void main(String[] args) {
        sayHello();
        sayHello2("2");

    }
}
