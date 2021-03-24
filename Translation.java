// QUESTION LINK: https://codeforces.com/problemset/problem/41/A

import java.util.*;

public class Translation {
  static String cal(String s, String t) {
    StringBuilder ip = new StringBuilder(t);
    if (s.equals(t)) {
      if (s.equals(ip.reverse().toString())) return "YES";
      else return "NO";
    } else if (s.equals(ip.reverse().toString())) return "YES";
    else return "NO";
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String t = sc.nextLine();
    System.out.println(cal(s, t));
  }
}
