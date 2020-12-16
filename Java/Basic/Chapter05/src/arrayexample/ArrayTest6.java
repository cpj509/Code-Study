package arrayexample;

public class ArrayTest6 {
    public static void main(String[] args) {
        char[] alphabets = new char[26];
        char ch = 'A';

//        alphabets[0]=ch;
//        System.out.println(ch);
//        ch++;
//        System.out.println(ch);


        for (int i = 0; i < alphabets.length; i++) {
            alphabets[i] = ch;
            ch++;
            System.out.println(alphabets[i] + "," + (int)alphabets[i]);
        }
    }
}
