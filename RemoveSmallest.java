// QUESTION LINK: https://codeforces.com/problemset/problem/1399/A
import java.util.*;

class RemoveSmallest {
  static void cal(int n, List<Integer> l) {
    Collections.sort(l);
    int len = l.size();
    int i = 0;
    int j = 1;
    while (i < l.size() && j < l.size()) {
      if (Math.abs(l.get(i) - l.get(j)) <= 1) {
        l.remove(i);
        i--;
        j--;
      }
      i++;
      j++;
    }
    if (l.size() == 1) System.out.println("YES");
    else System.out.println("NO");
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t-- > 0) {
      int n = sc.nextInt();
      List<Integer> l = new ArrayList<>();
      for (int i = 0; i < n; i++) {
        l.add(sc.nextInt());
      }
      cal(n, l);
    }
  }
}
