// QUESTION LINK: https://codeforces.com/problemset/problem/1343/B
import java.util.Scanner;

public class BalancedArray {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      if (n / 2 % 2 != 0) {
        System.out.println("NO");
      } else {
        int a[] = new int[n];
        int sum = 0;
        int k = 2;
        for (int i = 0; i <= n / 2 - 1; i++) {
          a[i] = k;
          sum = sum + k;
          k = k + 2;
        }
        int m = 1;
        for (int i = n / 2; i <= n - 2; i++) {
          a[i] = m;
          sum = sum - m;
          m = m + 2;
        }
        a[a.length - 1] = sum;
        System.out.println("YES");
        for (int ele : a) System.out.print(ele + " ");
        System.out.println();
      }
    }
  }
}
