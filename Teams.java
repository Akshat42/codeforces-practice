// QUESTION LINK: https://codeforces.com/problemset/problem/231/A

import java.util.Scanner;

public class Teams {
  public static int cal(int a[][]) {
    int count = 0;
    int res = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        if (a[i][j] == 1) count++;
      }
      if (count > 2 || count == 2) res++;
      count = 0;
    }
    return res;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[][] = new int[n][3];
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[i].length; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println(cal(a));
  }
}
