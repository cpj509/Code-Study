package abstractex.headshop;

public class Shop1 extends HeadShop{
    public Shop1(){
        System.out.println("대학가 매장입니다.");
    }
    @Override
    public void sellDoenjangJJige() {
        System.out.println("된장찌개:5,000원");
    }

    @Override
    public void sellKimChiJJige() {
        System.out.println("김치찌개:5,000원");
    }

    @Override
    public void sellBiBimBab() {
        System.out.println("비빔밥:5,000원");
    }
}
