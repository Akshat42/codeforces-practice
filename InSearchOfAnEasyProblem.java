// QUESTION LINK: https://codeforces.com/problemset/problem/1030/A
import java.util.Scanner;

class InSearchOfAnEasyProblem {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) a[i] = sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (a[i] == 1) {
        System.out.println("HARD");
        return;
      }
    }
    System.out.println("EASY");
  }
}
