package extendsframe;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private static final long serialVersionUID = 123L;

    public MyFrame(){
        setTitle("윈도우 프로그램");
        setLocation(600, 200);
        setSize(300, 200);
        Container contentPane = getContentPane();//call method

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new MyFrame();

    }
}
