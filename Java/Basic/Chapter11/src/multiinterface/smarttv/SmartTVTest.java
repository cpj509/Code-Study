package multiinterface.smarttv;

public class SmartTVTest {
    public static void main(String[] args) {
        SmartTV tv = new SmartTV();
        tv.turnOn();
        tv.search("asd");
        tv.setVolume(5);
        System.out.println(tv.getVolume());
        tv.setMute(true);
        tv.turnOff();
    }
}
