// QUESTION LINK: https://codeforces.com/problemset/problem/1283/A
import java.util.Scanner;

public class MinutesBeforeTheNewYear {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int h = sc.nextInt();
      int m = sc.nextInt();
      System.out.println((24 - h) * 60 - m);
    }
  }
}
