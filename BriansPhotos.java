// QUESTION LINK: https://codeforces.com/problemset/problem/707/A

import java.util.Scanner;

public class BriansPhotos {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    char a[][] = new char[n][m];
    boolean color = false;
    for (int i = 0; i < n; i++) for (int j = 0; j < m; j++) a[i][j] = sc.next().charAt(0);
    for (int i = 0; i < n; i++)
      for (int j = 0; j < m; j++) {
        if (a[i][j] == 'C' || a[i][j] == 'M' || a[i][j] == 'Y') color = true;
      }
    if (color) System.out.println("#Color");
    else System.out.println("#Black&White");
  }
}
