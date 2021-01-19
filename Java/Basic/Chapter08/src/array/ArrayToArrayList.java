package array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        String[] animalArray = new String[5];
        //자료 저장
        animalArray[0] = "dog";
        animalArray[1] = "cat";
        animalArray[2] = "cow";
        animalArray[3] = "pig";
        animalArray[4] = "ant";

        //자료 조회
        //일반 for문
        for (int i = 0; i < animalArray.length; i++) {
            System.out.print(animalArray[i] + " ");
        }
        System.out.println();
        //향상된 for문
        for (String s:
             animalArray) {
            System.out.print(s + " ");
        }
        System.out.println();
        //ArrayList로 동물 관리
        ArrayList<String> animalList = new ArrayList<>();
        animalList.addAll(Arrays.asList(animalArray));// addAll사용
//        animalList.add("dog");
//        animalList.add("cat");
//        animalList.add("cow");
//        animalList.add("pig");
//        animalList.add("ant");
        //일반 for문
        for (int i = 0; i < animalList.size(); i++) {
            String animal = animalList.get(i);
            System.out.print(animal + " ");
        }
        System.out.println();
        //향상된 for문
        for (String s:
             animalList) {
            System.out.print(s + " ");
        }
    }
}
