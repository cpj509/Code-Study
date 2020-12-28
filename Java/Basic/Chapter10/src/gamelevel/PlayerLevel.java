package gamelevel;

public abstract class PlayerLevel {//abstract class
    public abstract void run();//abstract method
    public abstract void jump();
    public abstract void turn();
    public abstract void showLevelMessage();

    //define template method
    public final void go(int count){//count는 점프의 횟수
        run();
        for (int i = 1; i <= count; i++) {
            jump();
        }
        turn();
    }
}
