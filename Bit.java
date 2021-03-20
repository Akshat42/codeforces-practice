// QUESTION LINK: https://codeforces.com/problemset/problem/282/A
import java.util.Scanner;

public class Bit {
  static int cal(String s[]) {
    int x = 0;
    for (int i = 0; i < s.length; i++) {
      if (s[i].contains("++")) x++;
      else if (s[i].contains("--")) x--;
    }
    return x;
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s[] = new String[n];
    int i = 0;
    while (n-- > 0) {
      s[i] = sc.nextLine();
      i++;
    }
    System.out.println(cal(s));
  }
}
