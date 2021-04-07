// QUESTION LINK: https://codeforces.com/problemset/problem/1374/A
import java.util.Scanner;

public class RequiredRemainder {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int x = sc.nextInt();
      int y = sc.nextInt();
      int n = sc.nextInt();
      int ans = -1;
      int k = n - ((n - y) % x);
      System.out.println(k);
    }
  }
}
