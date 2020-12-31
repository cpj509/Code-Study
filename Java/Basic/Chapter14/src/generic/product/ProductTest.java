package generic.product;

public class ProductTest {
    public static void main(String[] args) {
        //TV 생성
        Product<TV, String> product1 = new Product<TV, String>();
        product1.setKind(new TV());
        product1.setModel("Smart TV");
        String tvModel = product1.getModel();
        System.out.println(tvModel);

        //Car 생성
        Product<Car, String> product2 = new Product<Car, String>();
        product2.setKind(new Car());
        product2.setModel("Electric Car");
        System.out.println(product2.getModel());

    }
}
