package endoffile;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while(scan.hasNext()){
            String s = scan.nextLine();
            System.out.println(++num + " " + s);
        }
    }
}