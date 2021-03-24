// QUESTION LINK: https://codeforces.com/problemset/problem/344/A

import java.util.Scanner;

public class Magnets {
  static int cal(int a[], int n) {
    int first = a[0];
    int group = 0;
    for (int i = 1; i < n; i++) {
      if (a[i] == first) continue;
      else {
        group++;
        first = a[i];
      }
    }
    return group + 1;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println(cal(a, n));
  }
}
