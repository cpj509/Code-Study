package generic.threedprinter;

public class PrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
//        Plastic plastic = new Plastic();

        plasticPrinter.setMaterial(new Plastic());
//        System.out.println(plastic);
        System.out.println(plasticPrinter);

        //자료형이 Powder
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
        powderPrinter.setMaterial(new Powder());
        System.out.println(powderPrinter);
    }
}
