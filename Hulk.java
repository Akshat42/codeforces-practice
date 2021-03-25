// QUESTION LINK:  https://codeforces.com/problemset/problem/705/A

import java.util.Scanner;

public class Hulk {
  static void cal(int n) {
    String s = "";
    int nn = n;
    int i = 0;
    if (n == 1) {
      s = s + "I hate it ";
      System.out.println(s);
      return;
    } else {
      s = s + "I hate that ";
      i = 2;
      while (i < n) {
        if (i % 2 == 0) s = s + "I love that ";
        else s = s + "I hate that ";
        i++;
      }
      if (nn % 2 == 0) s = s + "I love it ";
      else s = s + "I hate it ";
    }
    System.out.println(s);
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    cal(n);
  }
}
