// QUESTION LINK: https://codeforces.com/problemset/problem/431/A

import java.util.Scanner;

public class BlackSquare {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[4];
    for (int i = 0; i < 4; i++) {
      a[i] = sc.nextInt();
    }
    sc.nextLine();
    String s = sc.nextLine();
    int len = s.length();
    int sum = 0;
    for (int i = 0; i < len; i++) {
      int no = Integer.parseInt(Character.toString(s.charAt(i)));
      sum = sum + a[no - 1];
    }
    System.out.println(sum);
  }
}
