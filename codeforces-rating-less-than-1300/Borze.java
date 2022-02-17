// Question Link: https://codeforces.com/problemset/problem/32/B

import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        String res = "";
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '.') {
                res = res + "0";
            } else if (s.charAt(i) == '-' && s.charAt(i + 1) == '-') {
                res = res + "2";
                i++;
            } else {
                res = res + "1";
                i++;
            }
        }
        System.out.println(res);
    }
}