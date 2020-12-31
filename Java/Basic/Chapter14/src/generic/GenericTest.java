package generic;

import java.util.ArrayList;

public class GenericTest {
    public static void main(String[] args) {
        /*
        //Non-generic
        //ArrayList 사용
        ArrayList list = new ArrayList();

        //요소 저장
        list.add("orange");
        list.add("banana");
        list.add("apple");

        //요소 가져오기
        String fruit = (String) list.get(2);//타입 변환이 필요(object -> String)
        System.out.println(fruit);
         */

        //generic
        ArrayList<String> list = new ArrayList<>();

        //요소 저장
        list.add("orange");
        list.add("banana");
        list.add("apple");

        //요소 가져오기
        String fruit = list.get(2);
        System.out.println(fruit);
    }
}
