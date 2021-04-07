//https://codeforces.com/problemset/problem/1353/B
import java.util.*;

public class TwoArraysAndSwap {
		public static void main (String args[]) {
				Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				while(t-->0) {
						int n = sc.nextInt();
						int k = sc.nextInt();
						List<Integer> l1 = new ArrayList<>();
						List<Integer> l2 = new ArrayList<>();
						for(int i=0;i<n;i++)
								l1.add(sc.nextInt());
						for(int i=0;i<n;i++)
								l2.add(sc.nextInt());
						for(int i=0;i<k;i++) {
								int minIndex = l1.indexOf(Collections.min(l1));
								int maxIndex = l2.indexOf(Collections.max(l2));
								int min = l1.get(minIndex);
								int max = Collections.max(l2);
								if(max > min) {
										l1.remove(minIndex);
										l1.add(max);
										l2.remove(maxIndex);
								}
						}
						int sum = 0;
						for(int i=0;i<l1.size();i++)
								sum = sum + l1.get(i);
						System.out.println(sum);
				}
		}
}


