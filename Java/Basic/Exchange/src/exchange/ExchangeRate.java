package exchange;

import java.util.Scanner;

public class ExchangeRate {
    private static float USD = 1099.48f;
    private static float JPY = 10.64f;
    private static float EURO = 1347.69f;
    private static float CNY = 168.19f;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float exchange = 0;
        boolean run = true;

        System.out.println("-----------------------------------------");
        System.out.println("1.USD | 2.JPY | 3. EUR | 4. CHY | 5. EXIT");
        System.out.println("-----------------------------------------");
        try{
            while(run){
                System.out.print("Enter won > ");
                int won = sc.nextInt();
                System.out.print("Select menu > ");
                int selNum = sc.nextInt();

                if(selNum==1) {
                    exchange = won / USD;
                    System.out.printf("%.2f USD\n", exchange);
                }else if(selNum==2) {
                    exchange = won / JPY;
                    System.out.printf("%.2f JPY\n", exchange);
                }else if(selNum==3) {
                    exchange = won / EURO;
                    System.out.printf("%.2f EURO\n", exchange);
                }else if(selNum==4) {
                    exchange = won / CNY;
                    System.out.printf(".2%f CNY\n", exchange);
                }else if(selNum==5){
                    run = false;
                }
            }
            System.out.println("Program finish!!");
            sc.close();
        }catch (Exception e){
            System.out.println(e);  //Exception Handling
        }

    }
}
