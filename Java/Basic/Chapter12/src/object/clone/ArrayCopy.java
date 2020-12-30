package object.clone;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        //Clone()으로 복사 - 이미 재정의 되어서 사용 가능
        int[] b = a.clone();
        for (int i:
             a) {
            System.out.print(i);
        }
        System.out.println();
        for (int i:
                b) {
            System.out.print(i);
        }
    }
}
