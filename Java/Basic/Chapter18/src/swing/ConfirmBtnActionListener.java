package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfirmBtnActionListener implements ActionListener {
    JTextField text;//텍스트 박스
    JLabel label;//label

    public ConfirmBtnActionListener(JTextField text, JLabel label) {
        this.text = text;
        this.label = label;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = text.getText(); //텍스트 상자에 입력된 이름을 가져와서
        label.setText("Hello " + name);//label에 넣어줌
    }
}
