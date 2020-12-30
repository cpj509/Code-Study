package multiinterface.smarttv;

public interface RemoteControl {
    //인터페이스 상수
    public int MAX_VOLUME = 10;
    public int MIN_VOLUME = 0;

    //추상 메서드
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);

    default void setMute(boolean mute){
        if(mute){
            System.out.println("Mute mode.");
        }else{
            System.out.println("Cancel Mute mode.");
        }
    }

    static void changeBattery(){
        System.out.println("Change battery");
    }
}
