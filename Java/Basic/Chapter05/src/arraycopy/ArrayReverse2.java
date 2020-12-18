package arraycopy;

public class ArrayReverse2 {
    public static void main(String[] args) {
        String[] animal1 = {"cat", "dog", "pig"};
        String[] animal2 = new String[3];

        for (int i = 0; i < animal1.length; i++) {
            animal2[i] = animal1[i];
        }
        for (int i = 0; i < animal1.length; i++) {
            System.out.print(animal2[i] + " ");
        }
        System.out.println("================");
        for (int i = 0; i < animal1.length; i++) {
            animal2[animal1.length - 1 - i] = animal1[i];
        }
        for (int i = 0; i < animal2.length; i++) {
            System.out.print(animal2[i] + " ");
        }
    }
}
