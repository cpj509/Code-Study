package arraylist;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        //ArrayList를 String class로 생성
        ArrayList<String> fruitList = new ArrayList<>();

        fruitList.add("Apple");
        fruitList.add("Tomato");
        fruitList.add("Orange");
        System.out.printf("%d\n", fruitList.size());
//        for (int i = 0; i < fruitList.size(); i++) {
//            System.out.println(fruitList.get(i));
//        }
        for (String s : fruitList) {
            System.out.println(s);
        }
    }
}
