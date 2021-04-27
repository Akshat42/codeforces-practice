// QUESTION LINK: https://codeforces.com/problemset/problem/935/A
import java.util.Scanner;

public class FafaAndHisCompany {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int count = 0;
    for (int i = 2; i <= n / 2; i++) {
      int diff = n - i;
      if (diff % i == 0) count++;
    }
    System.out.println(count + 1);
  }
}
