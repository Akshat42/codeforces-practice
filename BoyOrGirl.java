// QUESTION LINK: https://codeforces.com/problemset/problem/236/A

import java.util.*;
import java.util.Scanner;

public class BoyOrGirl {
  public static String cal(String s) {
    Set<Character> st = new HashSet<>();
    int len = s.length();
    for (int i = 0; i < len; i++) {
      st.add(s.charAt((i)));
    }
    if (st.size() % 2 == 0) return "CHAT WITH HER!";

    return "IGNORE HIM!";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(cal(s));
  }
}
