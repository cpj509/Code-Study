package bank;

import java.util.Scanner;

public class AppMain {
    private static Account[] accountArray = new Account[100];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while(run){
            System.out.println("---------------------------------------");
            System.out.println("1. 계좌 생성 | 2. 계좌 목록 " +
                    "| 3. 입금 | 4. 출금 | 5. 종료");
            System.out.println("---------------------------------------");
            System.out.print(">");

            int selNum = sc.nextInt();
            switch (selNum){
                case 1:
                    createAccount();
                    break;
                case 2:
                    accountList();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    withdraw();
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("올바른 번호를 입력해 주세요.");
            }
        }
        System.out.println("프로그램 종료");
        sc.close();

    }

    private static void withdraw() {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");
        System.out.print("계좌번호 : ");
        String accountNum = sc.next();
        System.out.print("출금액 : ");
        int money = sc.nextInt();

        try {
            Account account = findAccount(accountNum);
            if(account.getBalance() - money <= 0){
                System.out.println("잔액이 부족합니다.");
                System.out.println("처리 결과 : 출금에 실패하였습니다.");
                return;
            }
            account.setBalance(account.getBalance() - money);
            System.out.println("처리 결과 : 출금에 성공하였습니다.");
        } catch (Exception e) {
            System.out.println("계좌를 찾을 수 없습니다.");
            System.out.println("처리 결과 : 출금에 실패하였습니다.");
        }
    }

    private static void deposit() {
        System.out.println("----------");
        System.out.println("입금");
        System.out.println("----------");
        System.out.print("계좌번호 : ");
        String accountNum = sc.next();
        System.out.print("입금액 : ");
        int money = sc.nextInt();

        try {
            Account account = findAccount(accountNum);
            account.setBalance(account.getBalance() + money);
            System.out.println("처리 결과 : 입금에 성공하였습니다.");
        } catch (NullPointerException e) {
            System.out.println("계좌를 찾을 수 없습니다.");
            System.out.println("처리 결과 : 입금에 실패하였습니다.");
        }

    }

    private static Account findAccount(String accountNum) {
        Account account = null;
        for (Account value : accountArray) {
            if (value.getAccountNum().equals(accountNum)) {//외부 입력계좌와 일치하면
                account = value;
                return account;
            }
        }
        return null;
    }

    private static void accountList() {
        System.out.println("----------");
        System.out.println("계좌 목록");
        System.out.println("----------");
        for (Account account : accountArray) {
            if (account == null)
                break;
            account.showInfo();
        }
    }

    private static void createAccount() {
        System.out.println("----------");
        System.out.println("계좌 생성");
        System.out.println("----------");

        System.out.print("계좌 번호 : ");
        String accountNum = sc.next();//nextLine은 라인이 넘어감

        System.out.print("계좌주 : ");
        String owner = sc.next();

        System.out.print("초기 입금액 : ");
        int balance = sc.nextInt();

        Account newAccount = new Account(accountNum, owner, balance);

        for (int i = 0; i < accountArray.length; i++) {
            if(accountArray[i]==null) {
                accountArray[i] = newAccount;
                System.out.println("처리 결과 : 정상 처리 되었습니다.");
                break;
            }
        }
    }
}