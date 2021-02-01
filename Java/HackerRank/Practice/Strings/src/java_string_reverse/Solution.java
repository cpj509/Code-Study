package java_string_reverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        StringBuffer B = new StringBuffer(A);
        System.out.println(A.equals(B.reverse().toString())?"Yes":"No");
        //B.reverse()'s return is not String(reason to use toString() method)
    }
}