package arraylist;

import java.util.ArrayList;

public class LottoTest {
    public static void main(String[] args) {
        //integer array(length : 6)
        int[] lotto = new int[6];

        for (int i = 0; i < lotto.length; i++) {
            lotto[i] = (int)(Math.random()*45)+1;
            System.out.println(lotto[i]);
        }
        //Array Integer List
        ArrayList<Integer> lotto2 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            lotto2.add((int)(Math.random()*45)+1);
        }
        for (int i:
             lotto2) {
            System.out.print(i + " ");
        }

    }
}
