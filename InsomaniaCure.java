// QUESTION LINK: https://codeforces.com/problemset/problem/148/A

import java.util.Scanner;

public class InsomaniaCure {
  static int cal(int k, int l, int m,int n, int d) {
    int count = 0;
    int a[] = new int[d+1];
    for (int i = k; i <= d; i = i + k) {
      if (a[i] != 1) {
        a[i] = 1;
        count++;
      }
    }
    for (int i = l; i <= d; i = i + l) {
      if (a[i] != 1) {
        a[i] = 1;
        count++;
      }
    }
    for (int i = m; i <= d; i = i + m) {
      if (a[i] != 1) {
        a[i] = 1;
        count++;
      }
    }
 for (int i = n; i <= d; i = i + n) {
      if (a[i] != 1) {
        a[i] = 1;
        count++;
      }
    }
    return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int l = sc.nextInt();
    int m = sc.nextInt();
	int n = sc.nextInt();
    int d = sc.nextInt();
    System.out.println(cal(k, l, m,n, d));
  }
}
