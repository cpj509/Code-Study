package abstractex.headshop;

public class ShopTest {
    public static void main(String[] args) {
        HeadShop s1 = new Shop1();
        s1.sellBiBimBab();
        s1.sellDoenjangJJige();
        s1.sellKimChiJJige();

        System.out.println();

        HeadShop s2 = new Shop2();
        s2.sellBiBimBab();
        s2.sellDoenjangJJige();
        s2.sellKimChiJJige();
    }
}
