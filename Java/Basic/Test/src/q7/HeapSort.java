package q7;

public class HeapSort implements Sort{
    @Override
    public void ascending(int[] n1) {
        System.out.println("HeapSort ascending");
    }

    @Override
    public void descending(int[] n1) {
        System.out.println("HeapSort descending");
    }

    @Override
    public void description() {
        Sort.super.description();
        System.out.println("HeapSort 입니다.");
    }
}
