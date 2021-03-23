// QUESTION LINK: https://codeforces.com/problemset/problem/791/A

import java.util.Scanner;

public class BearAndBigBrother {
  public static int cal(int a, int b) {
    int count = 0;
    while (a <= b) {
      a = a * 3;
      b = b * 2;
      count++;
    }
    return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(cal(a, b));
  }
}
