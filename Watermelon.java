// QUESTION LINK: https://codeforces.com/problemset/problem/4/A

import java.util.Scanner;

public class Watermelon {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n == 2) {
      System.out.println("NO");
      return;
    }
    if (n % 2 == 0) System.out.println("YES");
    else System.out.println("NO");
  }
}
