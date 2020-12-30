package q7;

public interface Sort {
    void ascending(int[] n1);
    void descending(int[] n1);
    default void description(){
        System.out.println("숫자를 정렬하는 알고리즘 입니다");
    };
}
