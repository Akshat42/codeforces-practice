//	QUESTION LINK: https://codeforces.com/problemset/problem/750/A
import java.util.Scanner;

public class NewYearAndHurry {
  public static int cal(int n, int k) {
    int total_min = 240;
    int min = 240;
    int count = 0;
    for (int i = 1; i <= n; i++) {
      int time = i * 5;
      min = min - time;
      if (min >= k) count++;
      else break;
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    System.out.println(cal(n, k));
  }
}
