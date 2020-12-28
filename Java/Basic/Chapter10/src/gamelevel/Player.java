package gamelevel;

public class Player {
    private PlayerLevel level;

    public Player(){
        level = new Beginner();
        level.showLevelMessage();
    }

    public void upgradePlayerLevel(PlayerLevel level){//매개변수의 다형성
        this.level = level;
        level.showLevelMessage();
    }

    public void play(int count){
        level.go(count);
    }
}
