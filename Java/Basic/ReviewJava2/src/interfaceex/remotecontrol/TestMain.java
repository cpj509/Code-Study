package interfaceex.remotecontrol;

public class TestMain {
    public static void main(String[] args) {
        TV tv = new TV();

        tv.turnOn();
        tv.setVolume(1000);
        System.out.println(tv.getVolume());
        tv.setMute(true);
        tv.turnOff();
    }
}
