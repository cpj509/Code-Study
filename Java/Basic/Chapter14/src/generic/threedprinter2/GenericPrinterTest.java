package generic.threedprinter2;

public class GenericPrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Plastic> product1 = new GenericPrinter<>();
        product1.setMaterial(new Plastic());
        product1.doPrinting();

        GenericPrinter<Powder> product2 = new GenericPrinter<>();
        product2.setMaterial(new Powder());
        product2.doPrinting();

        //상속 받으면 상속 받은 클래스들 외에는 사용 불가.
//        GenericPrinter<Water> product3 = new GenericPrinter<>();
//        product2.setMaterial(new Water());
//        product2.doPrinting();
    }
}
