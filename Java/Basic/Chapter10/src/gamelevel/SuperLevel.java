package gamelevel;

public class SuperLevel extends PlayerLevel{
    @Override
    public void run() {
        System.out.println("Run fastest.");
    }

    @Override
    public void jump() {
        System.out.println("Jump highest.");
    }

    @Override
    public void turn() {
        System.out.println("Can turn.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("Super level.");
    }
}
