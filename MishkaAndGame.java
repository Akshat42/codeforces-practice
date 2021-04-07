// QUESTION LINK: https://codeforces.com/problemset/problem/703/A

import java.util.Scanner;

public class MishkaAndGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int chris = 0;
    int mishka = 0;
    while (n-- > 0) {
      int m = sc.nextInt();
      int c = sc.nextInt();
      if (m > c) mishka++;
      else if (m < c) chris++;
    }
    if (mishka > chris) System.out.println("Mishka");
    else if (chris > mishka) System.out.println("Chris");
    else System.out.println("Friendship is magic!^^");
  }
}
