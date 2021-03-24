// QUESTION LINK: https://codeforces.com/problemset/problem/271/A

import java.util.*;

public class BeautifulYear {
  static boolean isDistinct(int year) {
    List<Integer> l = new ArrayList<>();
    while (year != 0) {
      int rem = year % 10;
      if (l.contains(rem)) return false;
      else {
        l.add(rem);
      }
      year = year / 10;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (true) {
      n++;
      boolean flag = isDistinct(n);
      if (flag) {
        System.out.println(n);
        break;
      }
    }
  }
}
