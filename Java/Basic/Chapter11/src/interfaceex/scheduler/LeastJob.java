package interfaceex.scheduler;

public class LeastJob implements Scheduler {
    @Override
    public void getNextCall() {
        System.out.println("상담 전화를 차례대로 대기열에서 가져오기");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("상담 업무가 없거나 대기가 적은 상담원에게 배분합니다.");
    }
}
