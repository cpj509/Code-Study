package interfaceex.remocon;

public class Audio implements RemoteControl {
    public int volume;//volume member variable
    @Override
    public void turnOn() {
        System.out.println("Turn audio on.");
    }
    @Override
    public void turnOff() {
        System.out.println("Turn audio off.");
    }
    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        }
        else if(volume < RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        }
        else{
            this.volume = volume;
        }
    }

    public int getVolume() {
        return volume;
    }
}
