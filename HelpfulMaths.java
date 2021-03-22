// QESTION LINK: https://codeforces.com/problemset/problem/339/A

import java.util.*;

public class HelpfulMaths {
  public static String cal(String s) {
    ArrayList<Integer> al = new ArrayList<>();
    int len = s.length();
    for (int i = 0; i < len; i = i + 2) al.add(Integer.parseInt(Character.toString(s.charAt(i))));
    Collections.sort(al);
    String res = "";
    for (int i = 0; i < al.size() - 1; i++) {
      res = res + al.get(i) + "+";
    }
    res = res + al.get(al.size() - 1);
    return res;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    System.out.println(cal(s));
  }
}
