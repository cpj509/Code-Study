package algorithm;

public class SortTest2 {
    public static void main(String[] args) {
        //  오름차순 정렬 - Bubble Sort(Alphabet)
        char[] alphabets = {'S', 'B', 'M', 'K', 'C', 'Z', 'A'};
        char temp;
        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets.length - 1 - i; j++) {
                if (alphabets[j] > alphabets[j + 1]) {
                    temp = alphabets[j + 1];
                    alphabets[j + 1] = alphabets[j];
                    alphabets[j] = temp;
                }

            }

        }
        for (char a :
                alphabets) {
            System.out.print(a);

        }
    }
}
