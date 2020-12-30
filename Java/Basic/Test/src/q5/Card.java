package q5;

public class Card {
    private int cardNumber;
    private static int serialNum = 10000;

    public Card() {
        this.cardNumber = ++serialNum;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public static int getSerialNum() {
        return serialNum;
    }

    public static void setSerialNum(int serialNum) {
        Card.serialNum = serialNum;
    }
}
