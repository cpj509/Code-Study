package innerinterface;

public class ButtonTest {
    public static void main(String[] args) {
        //CallListener Class의 객체 생성 -> 매개 변수 전달
        Button button = new Button();
        button.setListener(new CallListener());
        button.touch();

        //MessageListener Class의 객체 생성
        button.setListener(new MessageListener());
        button.touch();

        //Class 없이 익명 객체 구현 -> 사진 찍는 기능
        button.setListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("사진을 찍습니다.");
            }
        });
        button.touch();

        //익명 객체 - 검색 기능
        button.setListener(new Button.OnClickListener() {
            @Override
            public void onClick() {
                System.out.println("검색을 합니다.");
            }
        });
        button.touch();
    }
}
