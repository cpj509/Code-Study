package extendsframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcEx extends JFrame {
    JPanel panel1;
    JPanel panel2;

    JComboBox<String> comboBox;
    JTextField leftText;
    JTextField rightText;
    JLabel label;
    JTextField answerText;

    JButton button_ok;
    JButton button_cancel;

    String[] operator = {"+", "-", "*", "/"};

    public CalcEx(){
        setTitle("사칙연산 프로그램");
        setLocation(400, 400);
        setSize(300, 150);
        Container container = getContentPane();

        panel1 = new JPanel();
        panel2 = new JPanel();
        comboBox = new JComboBox<>(operator);
        leftText = new JTextField(5);
        rightText = new JTextField(5);
        label = new JLabel("=");
        answerText = new JTextField(5);
        
        button_ok = new JButton("확인");
        button_cancel = new JButton("취소");

        container.setLayout(new FlowLayout());
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float num1 = Integer.parseInt(leftText.getText());
                float num2 = Integer.parseInt(rightText.getText());
                String s = (String) comboBox.getSelectedItem();
                float answer = 0;
                switch (s){
                    case "+":
                        answer = num1 + num2;
                        break;
                    case "-":
                        answer = num1 - num2;
                        break;
                    case "*":
                        answer = num1 * num2;
                        break;
                    case "/":
                        answer = num1 / num2;
                        break;
                }
                answerText.setText(String.valueOf(answer));
            }
        };

        ActionListener listener1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                leftText.setText("");
                rightText.setText("");
                answerText.setText("");
            }
        };
        container.add(panel1, "North");
        container.add(panel2, "Center");

        panel1.add(leftText);
        panel1.add(comboBox);
        panel1.add(rightText);
        panel1.add(label);
        panel1.add(answerText);

        panel2.add(button_ok);
        panel2.add(button_cancel);

        button_ok.addActionListener(listener);
        button_cancel.addActionListener(listener1);
//        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new CalcEx();
    }
}
