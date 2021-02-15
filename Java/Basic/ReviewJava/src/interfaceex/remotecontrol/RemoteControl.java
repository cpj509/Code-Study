package interfaceex.remotecontrol;

public interface RemoteControl {
    public int MAX_VOLUME = 10;
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
    default void setMute(boolean mute){
        if(mute)
            System.out.println("무음 처리 합니다.");
        else
            System.out.println("무음 해제 합니다.");
    }
}
