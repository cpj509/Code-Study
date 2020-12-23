package override.headshop;

public class Shop1 extends HeadShop {
    public Shop1(){
        System.out.println("대학가 매장입니다.");
    }

    @Override//메소드 재정의 - 애너테이션(@)
    public void sellDoenjangJJige() {
        System.out.println("된장찌개 : 6000won");
    }

    @Override
    public void sellkimchiJJige() {
        super.sellkimchiJJige();
    }

    @Override
    public void sellBibimBap() {
        super.sellBibimBap();
    }
}
