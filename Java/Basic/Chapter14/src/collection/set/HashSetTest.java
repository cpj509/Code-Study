package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();

        fruitSet.add("apple");
        fruitSet.add("orange");
        fruitSet.add("strawberry");

        System.out.println(fruitSet);

//        Iterator<String> iter = fruitSet.iterator();

//        for (; iter.hasNext(); ) {//for문
//            System.out.println(iter.next());
//        }

//        while(iter.hasNext()){//while문
//            System.out.println(iter.next());
//        }

        for (String s : fruitSet) {
            System.out.println(s);
        }

        fruitSet.remove("orange");
        System.out.println(fruitSet);

    }
}
