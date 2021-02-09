package inheritance.airplane;

public class SuperSonicAirPlane extends AirPlane{
    //비행 모드 - 일반, 초음속
    static final int NORMAL = 1;
    static final int SUPERSONIC = 2;

    int flyMode = NORMAL;

    @Override
    void fly() {
        if(flyMode == NORMAL)
            super.fly();
        else if(flyMode == SUPERSONIC)
            System.out.println("초음속 비행 합니다.");
    }
}
