package thread;

import java.awt.*;

public class BeepPrintTest3 {
    public static void main(String[] args) {
        //Use main thread and task thread(multi thread).
        //Anonymous object
        Thread thread = new Thread(new Runnable() {
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
        });
        thread.start();//start thread.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Beep");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
