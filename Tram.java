// QUESTION LINK: https://codeforces.com/problemset/problem/116/A

import java.util.Scanner;

public class Tram {
  public static int cal(int[] out, int[] in, int n) {
    int max = 0;
    int i = 0;
    int no = 0;
    while (n > 0) {
      no = no - out[i];
      no = no + in[i];
      if (no > max) max = no;
      i++;
      n--;
    }
    return max;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int in[] = new int[n];
    int out[] = new int[n];
    for (int i = 0; i < n; i++) {
      out[i] = sc.nextInt();
      in[i] = sc.nextInt();
    }
    System.out.println(cal(out, in, n));
  }
}
