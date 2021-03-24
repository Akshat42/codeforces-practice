// QUESTION LINK: https://codeforces.com/problemset/problem/110/A

import java.math.BigInteger;
import java.util.Scanner;

public class NearlyLuckyNumber {
  public static String cal(BigInteger n) {
    int lucky = 0;
    while (n.compareTo(BigInteger.ZERO) != 0) {
      int rem = n.mod(new BigInteger("10")).intValue();
      if (rem == 4 || rem == 7) lucky++;
      n = n.divide(new BigInteger("10"));
    }
    if (lucky == 4 || lucky == 7) return "YES";
    return "NO";
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    BigInteger n = sc.nextBigInteger();
    System.out.println(cal(n));
  }
}
