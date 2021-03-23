// QUESTION LINK: https://codeforces.com/problemset/problem/977/A

import java.util.Scanner;

public class WrongSubstraction {
  public static int cal(int a, int b) {
    while (b != 0) {
      int rem = a % 10;
      if (rem != 0) {
        a = a - 1;
      } else {
        a = a / 10;
      }
      b--;
    }
    return a;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println(cal(a, b));
  }
}
