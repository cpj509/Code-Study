package multiinterface.customer;

public interface Buy {
    public void buy();//추상 메서드

    default void order(){//구현(디폴트) 메서드
        System.out.println("구매 주문.");
    }
}
