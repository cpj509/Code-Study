package interfaceex.tire;

public class Car {
    Tire frontLeftTire = new HanTire(); //멤버 변수(객체) = 필드(field)
    Tire frontRightTire = new HanTire();
    Tire backLeftTire = new HanTire();
    Tire backRightTire = new HanTire();

    public void run (){
        frontLeftTire.roll();
        frontRightTire.roll();
        backLeftTire.roll();
        backRightTire.roll();
    }
}
