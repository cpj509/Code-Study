package lambda.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerExample {
    public static void main(String[] args) {
        //use functional interface
        Consumer<String> consumer = s -> System.out.println(s + 8);
        consumer.accept("Java ");

        BiConsumer<String, Integer> biConsumer = (s, i) -> System.out.println(s + i);
        biConsumer.accept("Java ", 8);

        //DoubleConsumer is not generic.
        DoubleConsumer doubleConsumer = d -> System.out.println("Java " + d);
        doubleConsumer.accept(8);
    }
}
