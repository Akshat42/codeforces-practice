// QUESTION LINK: https://codeforces.com/problemset/problem/155/A
import java.util.Scanner;

class ILoveUsername {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    int bad = a[0];
    int good = a[0];
    int count = 0;
    for (int i = 1; i < n; i++) {
      if (a[i] > good) {
        good = a[i];
        count++;
      } else if (a[i] < bad) {
        bad = a[i];
        count++;
      }
    }
    System.out.println(count);
  }
}
