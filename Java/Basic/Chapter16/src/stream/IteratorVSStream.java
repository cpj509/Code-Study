package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVSStream {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Kim", "Choi", "Tanaka");
        //'asList()' have a same function with 'add()'.

        //use Iterator class - Iterator
        Iterator<String> ir = list.iterator();
        while(ir.hasNext()){
            String name = ir.next();
            System.out.println(name);
        }

        //use Stream class -> lambda
        Stream<String> stream = list.stream();
//        stream.forEach(name -> System.out.println(name));
        stream.forEach(System.out::println);
        //'forEach()' have a same function with 'for()'.
    }
}
