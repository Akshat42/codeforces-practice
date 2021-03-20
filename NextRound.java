// QUESTION LINK:https://codeforces.com/problemset/problem/158/A`
import java.util.Scanner;

class NextRound {
  public static int cal(int n, int k, int a[]) {
    int number_k = a[k - 1];
    int count = 0;
    for (int i = 0; i < a.length; i++) {
      if (number_k < a[i] || number_k == a[i]) {
        if (a[i] == 0) continue;
        else {
          count++;
        }
      }
    }
    return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println(cal(n, k, a));
  }
}
