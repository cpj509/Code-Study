package bank;
/*
 * 1. 계좌 생성 시 - 중복 오류 해결
 * 2. 입, 출금 - 예외 처리(try catch)
 * 3. 출금 - 잔액 부족 시 재 입력
 * 4. 계좌 검색 기능 추가
 * 5. 계좌 삭제 기능 추가
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AppMain2 {
    private static final ArrayList<Account> accountArrayList = new ArrayList<>();
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean run = true;
        while(run){
            System.out.println("---------------------------------------");
            System.out.println("1. 계좌 생성 | 2. 계좌 목록 " +
                    "| 3. 입금 | 4. 출금 | 5. 계좌 검색 | 6. 계좌 삭제 | 7. 종료");
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
                    selectAccount();
                    break;
                case 6:
                    removeAccount();
                    break;
                case 7:
                    run = false;
                    break;
                default:
                    System.out.println("올바른 번호를 입력해 주세요.");
            }
        }
        System.out.println("프로그램 종료");
        sc.close();
    }

    private static void selectAccount() {
        System.out.println("검색 할 계좌의 계좌번호를 입력 해 주세요.");
        String accountNum = sc.next();
        try {
            Account account = findAccount(accountNum);
            assert account != null;
            account.showInfo();
        } catch (Exception e) {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    private static void removeAccount() {
        System.out.println("삭제 할 계좌의 계좌번호를 입력 해 주세요.");
        String accountNum = sc.next();
        try {
            Account account = findAccount(accountNum);
            if(account == null)
                throw null;
            accountArrayList.remove(account);
            System.out.println("삭제를 완료 했습니다.");
        } catch (Exception e) {
            System.out.println("계좌를 찾을 수 없습니다.");
        }
    }

    private static int checkMoney(){//음수 금액 체크
        while(true) {
            int money = sc.nextInt();
            if(money < 1){
                System.out.println("입금 가능 액수는 1원 이상입니다.");
                System.out.println("다시 입력 해 주세요.");
            }
            else
                return money;
        }
    }

    private static void createAccount() {
        System.out.println("----------");
        System.out.println("계좌 생성");
        System.out.println("----------");
        String accountNum = "";
        Loop1:
        while(true) {
            System.out.print("계좌 번호 : ");
            accountNum = sc.next();//nextLine은 라인이 넘어감
            for (Account account :
                    accountArrayList) {
                if (account.getAccountNum().equals(accountNum)) {
                    System.out.println("동일한 계좌 번호가 존재합니다.");
                    System.out.println("다시 입력 해 주세요.");
                    continue Loop1;
                }
            }
            break;
        }
        System.out.print("계좌주 : ");
        String owner = sc.next();

        System.out.print("초기 입금액 : ");
        int balance = checkMoney();

        Account newAccount = new Account(accountNum, owner, balance);
        accountArrayList.add(newAccount);
        System.out.println("처리 결과 : 정상 처리 되었습니다.");
    }

    private static void deposit() {
        System.out.println("----------");
        System.out.println("입금");
        System.out.println("----------");
        System.out.print("계좌번호 : ");
        String accountNum = sc.next();
        System.out.print("입금액 : ");
        int money = checkMoney();
        try {
            Account account = findAccount(accountNum);
            assert account != null;
            account.setBalance(account.getBalance() + money);
            account.showInfo();
            System.out.println("처리 결과 : 입금에 성공하였습니다.");
        } catch (NullPointerException e) {
            System.out.println("계좌를 찾을 수 없습니다.");
            System.out.println("처리 결과 : 입금에 실패하였습니다.");
        }
    }

    private static void withdraw() {
        System.out.println("----------");
        System.out.println("출금");
        System.out.println("----------");
        System.out.print("계좌번호 : ");
        String accountNum = sc.next();
        System.out.print("출금액 : ");
        int money = checkMoney();

        try {
            Account account = findAccount(accountNum);
            assert account != null;
            if(account.getBalance() - money < 0){
                System.out.println("잔액이 부족합니다.");
                System.out.println("처리 결과 : 출금에 실패하였습니다.");
                return;
            }
            account.setBalance(account.getBalance() - money);
            account.showInfo();
            System.out.println("처리 결과 : 출금에 성공하였습니다.");
        } catch (Exception e) {
            System.out.println("계좌를 찾을 수 없습니다.");
            System.out.println("처리 결과 : 출금에 실패하였습니다.");
        }
    }

    private static Account findAccount(String accountNum) {
        Account account = null;
        for (Account value : accountArrayList) {
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
        for (Account account : accountArrayList) {
            account.showInfo();
        }
    }
}