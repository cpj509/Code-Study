package thread;

public class BeepPrintTest2 {
    public static void main(String[] args) {
        //Use main thread and task thread(multi thread).
        Runnable beepTask = new BeepTask();
        Thread thread = new Thread(beepTask);//Thread 객체 생성(매개 변수가 작업 스레드)
        thread.start();//Thread 시작(멀티 태스킹)
        for (int i = 1; i <= 5; i++) {
            System.out.println("Beep");
            try {
                Thread.sleep(500);;
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
