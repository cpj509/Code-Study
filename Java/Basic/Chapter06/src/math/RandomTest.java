package math;

public class RandomTest {
    public static void main(String[] args) {
        String[] word = {"1", "2"};
        int rnd = (int)(Math.random()*word.length);
        System.out.println("index : " + rnd);
        System.out.println(word[rnd]);
    }
}
