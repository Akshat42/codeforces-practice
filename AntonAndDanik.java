// QUESTION LINK: https://codeforces.com/problemset/problem/734/A
import java.util.Scanner;

public class AntonAndDanik {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    int a = 0;
    int d = 0;
    for (int i = 0; i < n; i++) {
      if (s.charAt(i) == 'A') a++;
      else d++;
    }
    if (a > d) System.out.println("Anton");
    else if (a < d) System.out.println("Danik");
    else System.out.println("Friendship");
  }
}
