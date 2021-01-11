package extendsframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Exchange extends JFrame {
    JPanel pane1;
    JPanel pane2;
    JLabel label1;  //원화
    JTextField text;    //원화 입력상자
    JComboBox<String> combo;    //통화 목록
    JButton button; //변환 버튼
    JLabel label2;  //환전 결과 출력 라벨
    String[] currency = {"달러", "엔", "유로", "위안"};    //통화

    //오늘의 환율
    private static final float USD = 1098.10f;
    private static final float JPY = 10.54f;
    private static final float EUR = 1337.49f;
    private static final float CNY = 169.33f;

    public Exchange() throws HeadlessException {
        setTitle("환율 변환기");
        setLocation(300, 300);
        setSize(300, 150);
        Container contentPane = getContentPane();

        //Component 생성
        pane1 = new JPanel();
        pane2 = new JPanel();
        label1 = new JLabel("원화");
        text = new JTextField(10);//10은 크기
        combo = new JComboBox<>(currency);
        button = new JButton("변환");
        label2 = new JLabel("변환 결과");

        //배치 - 기본
        contentPane.add(pane1, "North");
        contentPane.add(pane2, "Center");

        //패널1 배치 - FlowLayout
        contentPane.setLayout(new FlowLayout());
        pane1.add(label1);
        pane1.add(text);
        pane1.add(combo);
        pane1.add(button);

        //패널2 배치 - FlowLayout
        pane2.add(label2);

        ActionListener listener = e -> {
            float won = Float.parseFloat(text.getText());
            String currency = (String) combo.getSelectedItem();
            assert currency != null;
            switch (currency) {
                case "달러":
                    won = won / USD;
                    label2.setText(String.format("%.2f＄", won));
                    break;
                case "엔":
                    won = won / JPY;
                    label2.setText(String.format("%.2f￥", won));
                    break;
                case "유로":
                    won = won / EUR;
                    label2.setText(String.format("%.2f€", won));
                    break;
                case "위안":
                    won = won / CNY;
                    label2.setText(String.format("%.2f￥", won));
                    break;
            }
//                label2.setText(String.valueOf(won));
//                label2.setText(String.format("%.2f", won));//소수 2자리까지 출력
        };
        button.addActionListener(listener);
        //디스플레이
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Exchange();
    }
}