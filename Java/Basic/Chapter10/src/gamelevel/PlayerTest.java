package gamelevel;

public class PlayerTest {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.play(2);

        PlayerLevel aLevel = new AdvancedLevel();
        p1.upgradePlayerLevel(aLevel);
        p1.play(2);

        PlayerLevel sLevel = new SuperLevel();
        p1.upgradePlayerLevel(sLevel);
        p1.play(2);
    }
}
