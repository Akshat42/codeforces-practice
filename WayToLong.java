// QUESTION LINK: https://codeforces.com/problemset/problem/71/A

import java.util.Scanner;

class WayToLong {
  public static String cal(String s) {
    int len = s.length();
    if (s.length() > 10)
      return Character.toString(s.charAt(0)) + (len - 2) + Character.toString(s.charAt(len - 1));
    else return s;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    while (n-- > 0) {
      String s = sc.nextLine();
      System.out.println(cal(s));
    }
  }
}
