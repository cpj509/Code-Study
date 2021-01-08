package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Flow;

public class PlusCalc {
    public static void main(String[] args) {
        //덧셈 프로그램 만들기
        JFrame frame = new JFrame("덧셈 프로그램");
        frame.setLocation(700, 500);
        frame.setSize(250, 120);

        Container contentPane = frame.getContentPane();

        //Component 생성
        JPanel panel1 = new JPanel();//하위 패널 생성
        JPanel panel2 = new JPanel();

        //Panel1 Layout 배치
        panel1.setLayout(new FlowLayout());
        JTextField text1 = new JTextField(5);//괄호 안의 숫자는 텍스트 상자의 크기
        JTextField text2 = new JTextField(5);
        JTextField text3 = new JTextField(5);
        
        //Panel2 Layout 배치
        panel2.setLayout(new FlowLayout());
        JButton btn1 = new JButton("확인");
        JButton btn2 = new JButton("취소");

        //내용 패널로 패널1, 패널2를 올림
        contentPane.add(panel1, "North");
        contentPane.add(panel2, "Center");

        //Panel1에 Component 올리기
        panel1.add(text1);
        panel1.add(new JLabel("+"));
        panel1.add(text2);
        panel1.add(new JLabel("="));
        panel1.add(text3);

        //Panel2에 Component 올리기
        panel2.add(btn1);
        panel2.add(btn2);

        //버튼 이벤트 처리 - 익명 객체 구현(구현 클래스를 만들지 않음)
        //확인 버튼 이벤트
        ActionListener listener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(text1.getText());//텍스트상자(문자) -> 숫자로 변환
                int num2 = Integer.parseInt(text2.getText());
                int sum = num1 + num2;
                text3.setText(String.valueOf(sum));//숫자를 문자로 변환 - valueOf()
            }
        };
        //취소 버튼 이벤트
        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text1.setText("");
                text2.setText("");
                text3.setText("");
            }
        };
        btn1.addActionListener(listener);
        btn2.addActionListener(listener1);

//        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
