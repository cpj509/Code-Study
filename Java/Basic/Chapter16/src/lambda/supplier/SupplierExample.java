package lambda.supplier;

import java.util.function.IntSupplier;

public class SupplierExample {
    public static void main(String[] args) {
        //Supplier 함수형 인터페이스 사용
        //IntSupplier -> 매개값이 없고, 리턴값이 있음
        IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;
        for (int i = 0; i < 5; i++) {
            System.out.println("Dice number : " + intSupplier.getAsInt());
        }
    }
}
