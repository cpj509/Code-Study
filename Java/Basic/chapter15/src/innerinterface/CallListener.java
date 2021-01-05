package innerinterface;

public class CallListener implements Button.OnClickListener{
    //Button class의 OnClickListener interface를 구현한 Class.
    @Override
    public void onClick() {
        System.out.println("전화를 겁니다.");
    }
}
