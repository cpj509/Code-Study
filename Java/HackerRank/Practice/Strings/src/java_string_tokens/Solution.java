package java_string_tokens;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] str = s.split("[ .,?!]+");
        System.out.println(str.length);
        for (String s1:
             str) {
            System.out.println(s1);
        }
        scan.close();
    }
}