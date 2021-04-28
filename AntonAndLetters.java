// QUESTION LINK: https://codeforces.com/problemset/problem/443/A
import java.util.*;

public class AntonAndLetters {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int len = s.length();
    StringBuilder sb = new StringBuilder(s);
    sb = sb.deleteCharAt(len - 1);
    sb = sb.deleteCharAt(0);
    len = len - 2;
    if (sb.length() == 1) {
      System.out.println(1);
      return;
    }
    if (sb.length() > 0) {
      Set<Character> set = new HashSet<>();
      for (int i = 0; i < len; i++) {
        set.add(sb.charAt(i));
      }
      System.out.println(set.size() - 2);
    } else {
      System.out.println(0);
    }
  }
}
