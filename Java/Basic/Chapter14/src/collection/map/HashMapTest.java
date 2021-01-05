package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Naver", 50000);
        hashMap.put("Kakao", 40000);
        hashMap.put("Kakao", 60000);//duplicate test
        hashMap.put("NCsoft", 10000);

        System.out.println(hashMap);

        System.out.println("Naver's value : " + hashMap.get("Naver"));//use key to get value
        System.out.println();

        Set<String> keySet = hashMap.keySet();
/*
        //use iterator
        //Set<String> keySet = hashMap.keySet();
        //Iterator<String> iter = keySet.iterator();
        Iterator<String> iter = hashMap.keySet().iterator();//merge upper two line.
        while (iter.hasNext()){
            String key = iter.next();//get key
            Integer value = hashMap.get(key);//get key's value
            System.out.println(value);
        }*/

        //foreach version
        for (String key : keySet) {
            Integer value = hashMap.get(key);
            System.out.println(key + "'s value : " + value);
        }

        //remove object
        if(hashMap.containsKey("NCsoft"))
            hashMap.remove("NCsoft");
        hashMap.put("Daum", 100);
        System.out.println(hashMap);
    }
}
