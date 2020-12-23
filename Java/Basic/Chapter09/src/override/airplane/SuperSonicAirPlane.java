package override.airplane;

public class SuperSonicAirPlane extends AirPlane {
    public static final int NORMAL = 1;//상수, final이 붙으면 최종 수정 되었다는 뜻임.
    public static final int SUPERSONIC = 2;

    int flyMode = NORMAL;//비행 모드(1-일반비행, 2-초음속비행)

    @Override
    public void fly() {
        if(flyMode ==SUPERSONIC){
            System.out.println("비행기가 초음속 비행을 합니다.");
        }else
            super.fly();//부모 method 상속
    }
}
