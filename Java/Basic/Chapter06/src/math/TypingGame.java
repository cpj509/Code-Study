package math;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TypingGame {
    public static void main(String[] args) {
        String[] data = {"a", "b", "c", "d"};
        System.out.println("English game");
        long millisecond = 0;
        int n = 1;
        millisecond = System.currentTimeMillis();
        Scanner sc = new Scanner(System.in);
        for(int i=1; i<=data.length; i++){
            System.out.println("Question " + n);
            int rnd = (int)(Math.random()*data.length);
            String question = data[rnd];
            System.out.println(question);

            String answer = sc.next();
            if(answer.equals(question)){
                System.out.println("Correct!!");
                n++;
            }
            else{
                System.out.println("Incorrect!!!");
            }
        }
        millisecond = System.currentTimeMillis() - millisecond;
        System.out.println((float)millisecond/1000 + "Seconds.");
        sc.close();
    }
}
