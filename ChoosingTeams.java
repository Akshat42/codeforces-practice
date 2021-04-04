import java.util.*;

public class ChoosingTeams {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
	List<Integer> l = new ArrayList<>();
    int a[] = new int[n];
    for (int i = 0; i < n; i++) {
      l.add(sc.nextInt());
    }
    int teams = 0;
    int count = 0;
    for (int j = 1; j <= k; j++) {
      for (int i = 0; i < l.size(); i++) {
        if (count == 2) {
          teams++;
          count = 0;
        }
        if (l.get(i) < 5) {
				l.remove(i);
          count++;          
        }
      }
    }
    System.out.println(teams);
  }
}
