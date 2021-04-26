// QUESTION LINK: https://codeforces.com/problemset/problem/1097/A
import java.util.*;

class GenaddyAndACardGame {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String tableRank = Character.toString(s.charAt(0));
    String tableSuit = Character.toString(s.charAt(1));
    char table[] = s.toCharArray();
    String cards[] = new String[5];
    for (int i = 0; i < 5; i++) cards[i] = sc.next();
    for (int i = 0; i < cards.length; i++) {
      String rank = Character.toString(cards[i].charAt(0));
      String suit = Character.toString(cards[i].charAt(1));
      if (rank.equals(tableRank)) {
        System.out.println("YES");
        return;
      }
      if (suit.equals(tableSuit)) {
        System.out.println("YES");
        return;
      }
    }
    System.out.println("NO");
  }
}
