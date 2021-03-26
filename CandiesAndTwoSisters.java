// QUESTION LINK: https://codeforces.com/problemset/problem/1335/A
import java.util.Scanner;

class CandiesAndTwoSisters {
  public static int cal(int n) {
    return ((n - 1) / 2);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) System.out.println(cal(sc.nextInt()));
  }
}
