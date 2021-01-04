package collection.list;

import java.util.Stack;

class Coin{
    private  int money;

    public Coin(int money) {//set
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}

public class CoinStackTest {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<>();

        Coin coin10 = new Coin(10);
        Coin coin50 = new Coin(50);
        Coin coin100 = new Coin(100);
        Coin coin500 = new Coin(500);

        coinBox.push(coin500);
        coinBox.push(coin100);
        coinBox.push(coin50);
        coinBox.push(coin10);

        //그냥 맨 앞 배열부터 출력
//        for (Coin c:
//             coinBox) {
//            System.out.println(c.getMoney());
//        }
        
        //Stack의 원리대로 출력
        while (!coinBox.isEmpty()){
            Coin coin = coinBox.pop();
            System.out.println(coin.getMoney());
        }

    }
}
