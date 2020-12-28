package gamelevel;

public class Beginner extends PlayerLevel {
    @Override
    public void run() {
        System.out.println("Run slow.");
    }

    @Override
    public void jump() {
        System.out.println("Can't jump.");
    }

    @Override
    public void turn() {
        System.out.println("Can't turn.");
    }

    @Override
    public void showLevelMessage() {
        System.out.println("Beginner level.");
    }
}
