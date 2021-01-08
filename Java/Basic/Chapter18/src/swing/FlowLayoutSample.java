package swing;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutSample {
    public static void main(String[] args) {
        //레이아웃 배치 - FlowLayout -> 왼쪽에서 오른쪽으로 배치
        JFrame frame = new JFrame("Zoo Program");
        frame.setLocation(700, 100);

        //내용 패널
        Container contentPane = frame.getContentPane();

        //배치 레이아웃
        FlowLayout layout = new FlowLayout();
        contentPane.setLayout(layout);//배치 세팅(FlowLayout)

        //Component - 버튼 생성
        contentPane.add(new JButton("기린"));
        contentPane.add(new JButton("사슴"));
        contentPane.add(new JButton("곰"));
        contentPane.add(new JButton("사자"));
        contentPane.add(new JButton("호랑이"));

        //디스플레이
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}