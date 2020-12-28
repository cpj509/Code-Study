package interfaceex.scheduler;

import java.io.IOException;

public class SchedulerTest {
    public static void main(String[] args) throws IOException {
        System.out.println("전화 상담 배분 방식을 선택하세요.");
        System.out.println("R : 한 명씩 차례로 배분");
        System.out.println("L : 대기가 가장 적은 상담원으로 배분");
        System.out.println("P : 우선 순위가 높은 사람부터 배분");
        System.out.println("A : 에이전트가 전화를 받음");

        int ch = System.in.read();//한 문자를 입력받을 때 사용 구문
        Scheduler scheduler = null;//인터페이스 형으로 인스턴스 변수 선언

        if(ch == 'R' || ch == 'r'){
            scheduler = new RoundRobin();
        }else if(ch == 'L' || ch == 'l'){
            scheduler = new LeastJob();
        }else if(ch == 'P' || ch == 'p'){
            scheduler = new PriorityAllocation();
        }else if(ch == 'A' || ch == 'a'){
            scheduler = new AgentGetCall();
        }else{
            System.out.println("유효하지 않은 입력입니다.");
            return;
        }
        scheduler.getNextCall();
        scheduler.sendCallToAgent();
    }
}
