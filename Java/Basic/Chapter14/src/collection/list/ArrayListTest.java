package collection.list;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> vegeList = new ArrayList<>();

        //save object
        vegeList.add("onion");
        vegeList.add("garlic");
        vegeList.add("carrot");

        //print object
        System.out.println(vegeList);

        //num of object
        System.out.println(vegeList.size());

        //input value in object
        vegeList.add(1, "pepper");
        System.out.println(vegeList);

        //modify value in object
        vegeList.set(1, "tomato");
        System.out.println(vegeList);

        //remove value in object
        vegeList.remove(1);
        System.out.println(vegeList);
    }
}
