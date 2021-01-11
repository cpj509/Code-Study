package extendsframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxEx extends JFrame {
    JComboBox<String> comboBox; // 멤버 변수
    JLabel label;
    
    String[] money = {"달러", "엔", "유로", "위안"};//콤보 박스의 내용
    
    public ComboBoxEx(){
        setTitle("목록 메뉴 선택");
        setLocation(300, 300);
        setSize(300, 150);
        Container contentPane = getContentPane();
        
        //컴포넌트 객체 생성
        comboBox = new JComboBox<>(money);
        label = new JLabel("환율 변환");
        
        //배치 - 레이아웃
        contentPane.add(comboBox, "North");
        contentPane.add(label, "Center");

        //이벤트 처리
        ActionListener listener = new ActionListener() {
            //목록의 통화를 선택하면 label에 출력
            @Override
            public void actionPerformed(ActionEvent e) {
                String money = (String) comboBox.getSelectedItem();//메뉴 선택
                label.setText(money + "를 선택 하셨습니다.");
            }
        };
        comboBox.addActionListener(listener);
                
        //디스플레이
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new ComboBoxEx();
        
    }
}
