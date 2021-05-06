// QUESTION LINK: https://codeforces.com/contest/1520/problem/A
import java.util.*;

class div3 {

  public static String solve(String s, int n) {
    Stack<Character> st = new Stack<>();
    st.push(s.charAt(0));
    for (int i = 1; i < n; i++) {
      char ch = s.charAt(i);
      if (ch != st.peek()) {
        if (st.contains(ch)) {
          return "NO";
        } else {
          st.push(ch);
        }
      }
    }
    return "YES";
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      sc.nextLine();
      String s = sc.nextLine();
      System.out.println(solve(s, n));
    }
  }
}
