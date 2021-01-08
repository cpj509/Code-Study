package swing;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutSample {
    public static void main(String[] args) {
        //기본 레이아웃 - BorderLayout - 동, 서, 남, 북, 중앙에 위치
        JFrame frame = new JFrame("BorderLayout");
        frame.setLocation(500, 400);
        frame.setSize(350, 115);
        Container contentPane = frame.getContentPane();

        //component(컴포넌트) 생성
        JTextField text = new JTextField();
        JButton button1 = new JButton("추가");
        JButton button2 = new JButton("삭제");

        //layout 배치
//        contentPane.add(text, "North");//BorderLayout을 생략한 형태
        contentPane.add(text, BorderLayout.NORTH);
        contentPane.add(button1, "Center");
        contentPane.add(button2, "South");

//        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
