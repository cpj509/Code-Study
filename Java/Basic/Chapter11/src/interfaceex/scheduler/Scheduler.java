package interfaceex.scheduler;

public interface Scheduler {
    //abstract method
    public void getNextCall();  //다음 전화를 가져옴.
    public void sendCallToAgent();  //전화를 상담사에게 전달.
}
