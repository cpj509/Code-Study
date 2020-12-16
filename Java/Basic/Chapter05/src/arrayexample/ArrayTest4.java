package arrayexample;

public class ArrayTest4 {
    public static void main(String[] args) {
        double[] data = new double[5];
        double total = 0;
        double times = 1;

        data[0] = 10.0;
        data[1] = 20.0;
        data[2] = 30.0;

        System.out.printf("%d\n", data.length);

        for (double datum : data) {
            System.out.println(datum);
            total += datum;
            times *= datum;
        }
        System.out.println(total);
        System.out.println(times);
    }
}
