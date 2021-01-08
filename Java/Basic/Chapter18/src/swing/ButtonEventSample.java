package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ButtonEventSample {
    public static void main(String[] args) {
        //입력받아서 이름을 출력하는 프로그램
        JFrame frame = new JFrame("Hello 프로그램");
        frame.setLocation(500, 500);
        frame.setSize(250, 100);

        Container contentPane = frame.getContentPane();

        //Component 생성
        JTextField text = new JTextField();
        JButton button = new JButton("확인");
        JLabel label = new JLabel("Hello");

        //배치 - BorderLayout - 기본배치
        contentPane.add(text, "Center");
        contentPane.add(button, "East");
        contentPane.add(label, "South");

        //버튼 이벤트 처리 - addActionListener()를 사용
        ActionListener listener = new ConfirmBtnActionListener(text, label);
        button.addActionListener(listener);
        //Display
//        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
