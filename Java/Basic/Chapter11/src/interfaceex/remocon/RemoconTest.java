package interfaceex.remocon;

public class RemoconTest {
    public static void main(String[] args) {
        RemoteControl rcTV = new Television();
        rcTV.turnOn();
        rcTV.setVolume(5);
        System.out.println(((Television)rcTV).getVolume());
        rcTV.setMute(true);
        rcTV.setMute(false);
        RemoteControl.changeBattery();
        rcTV.turnOff();

        System.out.println("=======================");

        RemoteControl rcAudio = new Audio();
        rcAudio.turnOn();
        rcAudio.setVolume(-1);
        System.out.println(((Audio)rcAudio).getVolume());
        rcAudio.setMute(true);
        RemoteControl.changeBattery();
        rcAudio.turnOff();
    }
}
