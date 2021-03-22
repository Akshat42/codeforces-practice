// QUESTION LINK: https://codeforces.com/problemset/problem/266/A
import java.util.Scanner;

public class StonesOnTheTable {
  public static int cal(String s, int n) {
    StringBuilder sb = new StringBuilder(s);
    int count = 0;
    int len = n;
    for (int i = 0; i < len - 1; i++) {
      if (sb.charAt(i) == sb.charAt(i + 1)) {
        sb.deleteCharAt(i);
        count++;
        len = len - 1;
        i = i - 1;
      }
    }
    return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    System.out.println(cal(s, n));
  }
}
