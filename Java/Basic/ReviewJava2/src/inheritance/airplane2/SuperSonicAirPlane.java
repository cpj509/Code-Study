package inheritance.airplane2;

public class SuperSonicAirPlane extends AirPlane {
    //비행 모드 - 일반, 초음속


    int flyMode = Define.NORMAL;

    @Override
    void fly() {
        if(flyMode == Define.NORMAL)
            super.fly();
        else if(flyMode == Define.SUPERSONIC)
            System.out.println("초음속 비행 합니다.");
    }
}
