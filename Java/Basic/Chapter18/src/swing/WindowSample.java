package swing;

import javax.swing.*;
import java.awt.*;

public class WindowSample {
    public static void main(String[] args) {
        //윈도우 프로그램 만들기
        JFrame frame = new JFrame("Hello 프로그램");//윈도우의 제목
        frame.setLocation(600, 600);//윈도우의 위치(왼쪽 위 꼭지점의 위치)
        frame.setSize(400, 400);//윈도우의 크기
        //내용 패널 생성(중심 패널). 필수.
        Container contentPane = frame.getContentPane();
        //레이블 생성
//        JLabel label = new JLabel("Hello, Java");//출력 되는 내용.
        JLabel label = new JLabel("Hello, Java", SwingConstants.CENTER);//출력 되는 내용. SwingConstants.CENTER는 중앙 정렬.

        contentPane.add(label);//패널 위에 레이블을 올려 놓음.

//        frame.pack();//디스플레이 준비(정돈). setsize를 안 할 때에만 사용함.
        frame.setVisible(true);//디스 플레이
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//종료 버튼

    }
}
