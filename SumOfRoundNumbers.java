// QUESTION LINK: https://codeforces.com/problemset/problem/1352/A

import java.util.*;

public class SumOfRoundNumbers {
  static void cal(int n) {
    String s = Integer.toString(n);
    int len = s.length();
    int number[] = new int[len];
    for (int i = 0; i < len; i++) {
      number[i] = s.charAt(i) - '0';
    }
    List<Integer> l = new ArrayList<>();
    int place = len - 1;
    for (int i = 0; i < len; i++) {
      int no = number[i] * (int) (Math.pow(10, place));
      if (no != 0) l.add(no);
      place--;
    }
    System.out.println(l.size());
    for (int ele : l) System.out.print(ele + " ");
    System.out.println();
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      cal(n);
    }
  }
}
