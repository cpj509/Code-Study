package thread;

import java.awt.*;

public class BeepTask implements Runnable{
    //Make thread to play beep sound.
    @Override
    public void run() {
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
