package inheritance.airplane;

public class AirPlane {

    AirPlane(){}    //기본 생성자.
    void takeOff(){
        System.out.println("비행기가 이륙합니다.");
    };

    void fly(){
        System.out.println("비행기가 일반 비행합니다.");
    }

    void land(){
        System.out.println("비행기가 착륙합니다.");
    }
}
