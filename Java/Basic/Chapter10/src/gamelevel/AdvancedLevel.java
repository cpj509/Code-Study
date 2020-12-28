package gamelevel;

public class AdvancedLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("Run faster.");
    }

    @Override
    public void jump() {
        System.out.println("Jump highly.");
    }

    @Override
    public void turn() {
        System.out.println("Can't turn too.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("Advanced level.");
    }
}
