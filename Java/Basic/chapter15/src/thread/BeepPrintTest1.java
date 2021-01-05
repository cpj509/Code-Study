package thread;

import java.awt.*;

public class BeepPrintTest1 {
    public static void main(String[] args) {
        //use only main thread
        //Print "Beep" string 5 times. - 1 second interval.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Beep");
            try {
                Thread.sleep(500);;
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        //Play beep sound.
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 1; i <= 5; i++) {
            toolkit.beep();//play "Beep" sound method
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
