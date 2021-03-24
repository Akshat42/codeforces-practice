// QUESTION LINK: https://codeforces.com/problemset/problem/677/A
import java.util.Scanner;

public class VanyaAndFence {
  public static int cal(int[] a, int h, int n) {
    int width = 0;
    for (int i = 0; i < a.length; i++) {
      if (a[i] <= h) width++;
      else width = width + 2;
    }
    return width;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int h = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    System.out.println(cal(a, h, n));
  }
}
