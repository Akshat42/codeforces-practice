// QUESTION LINK: https://codeforces.com/problemset/problem/996/A

import java.util.Scanner;

public class HitTheLottery {
  public static int cal(int n) {
    int count = 0;
    int rem = 0;
    if (n >= 100) {
      rem = n / 100;
      count = count + rem;
      n = n - 100 * rem;
    }
    if (n < 100 && n >= 20) {
      rem = n / 20;
      n = n - 20 * rem;
      count = count + rem;
    }
    if (n < 20 && n >= 10) {
      rem = n / 10;
      n = n - 10 * rem;
      count = count + rem;
    }
    if (n < 10 && n >= 5) {
      rem = n / 5;
      n = n - 5 * rem;
      count = count + rem;
    }
    if (n < 5 && n > 0) {
      count = count + n;
    }
    return count;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println(cal(sc.nextInt()));
  }
}
