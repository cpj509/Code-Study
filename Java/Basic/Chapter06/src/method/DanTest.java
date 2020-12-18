package method;

class Dan{
    public void dan(int dan){//인스턴스형 메서드 | static형 메서드)
        for (int i = 1; i < 10; i++) {
            System.out.println(dan + "x" + i + "=" + (dan*i));
        }
    }
}

public class DanTest {
    public static void main(String[] args) {
        Dan gg = new Dan();
        gg.dan(7);

    }
}
