package iostream.inputstream;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("사번을 입력하세요 : ");
        int num = sc.nextInt();

        System.out.print("이름을 입력하세요 : ");
        String name = sc.next();

        System.out.print("직업을 입력하세요 : ");
        String job = sc.next();



        System.out.println(name);
        System.out.println(job);
        System.out.println(num);
    }
}
