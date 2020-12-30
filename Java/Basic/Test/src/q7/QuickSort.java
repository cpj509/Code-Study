package q7;

public class QuickSort implements Sort {
    @Override
    public void ascending(int[] n1) {
        System.out.println("QuickSort ascending");

    }

    @Override
    public void descending(int[] n1) {
        System.out.println("QuickSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("QuickSort 입니다.");

    }
}
