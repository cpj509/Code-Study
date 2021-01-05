package innerinterface;

public class Button {
    private OnClickListener listener;//인터페이스형 멤버 변수 선언
    interface OnClickListener{
        public void onClick();
    }

    public void setListener(OnClickListener listener) {
        //매개변수를 객체로 전달 - 다형성 구현
        this.listener = listener;
    }

    public void touch(){
        listener.onClick();
    }
}
