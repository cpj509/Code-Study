package finalex;

public class Constant {
    int num = 10;
    final int MAX = 100;

    public static void main(String[] args) {
        Constant cons = new Constant();
        cons.num = 20;
        System.out.println(cons.num);
//        cons.MAX = 40;//상수는 변경 불가.
    }
}
