// QUESTION LINK: https://codeforces.com/problemset/problem/510/A
import java.util.*;

public class FoxAndSnake {
  public static char[][] snake(int n, int m) {
    char a[][] = new char[n][m];
    for (int i = 0; i < n; i = i + 2) {
      for (int j = 0; j < m; j++) {
        a[i][j] = '#';
      }
    }
    int k = m - 1;
    for (int i = 1; i < n; i = i + 2) {
      for (int j = 0; j < m; j++) {
        a[i][j] = '.';
      }
    }
    for (int i = 1; i < n; i = i + 4) {
      a[i][k] = '#';
    }
    for (int j = 3; j < n; j = j + 4) {
      a[j][0] = '#';
    }
    return a;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    char res[][] = snake(n, m);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(res[i][j]);
      }
      System.out.println();
    }
  }
}
