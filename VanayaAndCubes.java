// QUESTION LINK: https://codeforces.com/problemset/problem/492/A
import java.util.Scanner;

public class VanayaAndCubes {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int max = 0;
    int sum = 0;
    int height = 0;
    for (int i = 1; i <= n; i++) {
      sum = sum + i;
      max = max + sum;
      if (max > n) break;
      height++;
    }
    System.out.println(height);
  }
}
