package decorator.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class EnglishTypingTest {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("animal.txt");
            BufferedReader br = new BufferedReader(fr)){
            Scanner sc = new Scanner(System.in);
            String line = null;
            String[] animals = null;
            String answer = null;
            while((line = br.readLine()) != null){
                animals = line.split(" ");
            }
            assert animals != null;
            System.out.println("==Typing Game - Press Enter==");
            sc.nextLine();
            for(int i = 0; i < animals.length; i++) {
                int randIndex = (int) (Math.random() * animals.length);
                System.out.println(animals[randIndex]);
                System.out.print("Type word. > ");
                answer = sc.next();
                System.out.println("You type " + answer);
                if(animals[randIndex].equals(answer))
                    System.out.println("Correct!!");
                else
                    System.out.println("Incorrect!!!");
            }
            System.out.println("==Game Over==");
            sc.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
