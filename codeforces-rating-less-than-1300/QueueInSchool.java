// Question Link: https://codeforces.com/problemset/problem/266/B

import java.util.Scanner;

public class QueueInSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        for (int i = 0; i < t; i++) {
            String temp = "";
            for (int j = 0; j < n; j++) {
                if (j + 1 < n && s.charAt(j) == 'B' && s.charAt(j + 1) == 'G') {
                    temp = temp + "G" + "B";
                    j++;
                } else {
                    temp = temp + s.charAt(j);
                }
            }
            s = temp;
        }
        System.out.println(s);
    }
}