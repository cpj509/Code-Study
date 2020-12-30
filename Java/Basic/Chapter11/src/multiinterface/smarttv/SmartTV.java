package multiinterface.smarttv;

public class SmartTV implements RemoteControl, Searchable{
    private int volume;
    @Override
    public void search(String url) {
        System.out.println(url + "을 검색합니다.");
    }

    @Override
    public void turnOn() {
        System.out.println("Smart TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Smart TV를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > interfaceex.remocon.RemoteControl.MAX_VOLUME){
            this.volume = interfaceex.remocon.RemoteControl.MAX_VOLUME;
        }
        else if(volume < interfaceex.remocon.RemoteControl.MIN_VOLUME){
            this.volume = interfaceex.remocon.RemoteControl.MIN_VOLUME;
        }
        else{
            this.volume = volume;
        }
    }

    public int getVolume() {
        return volume;
    }
}
