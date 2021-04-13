package java_anagrams;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() != b.length())
            return false;

        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();

        java.util.Arrays.sort(aa);
        java.util.Arrays.sort(bb);

        return java.util.Arrays.equals(aa, bb);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}