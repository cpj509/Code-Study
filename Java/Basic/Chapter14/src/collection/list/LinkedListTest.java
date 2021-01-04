package collection.list;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> myList = new LinkedList<>();

        //add object
        myList.add("A");
        myList.add("B");
        myList.add("C");

        System.out.println(myList);
        for (String s:
             myList) {
            System.out.print(s + " ");
        }
        System.out.println();

        myList.add(2, "D");

        System.out.println(myList);

        myList.addLast("E");

        System.out.println(myList);

        myList.removeFirst();

        System.out.println(myList);


    }
}
