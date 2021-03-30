//QUESTION LINK: https://codeforces.com/problemset/problem/1399/A
import java.util.*;

class RemoveSmallest {
		static void cal(int n, List<Integer> l) {
				Collections.sort(l);
				for(int i=0;i<l.size();i++) {
						if(Math.abs(l.get(i)-l.get(l.size()-1-i))<=1){
								l.remove(l.get(i));
						}
				}
				System.out.println(l);
		}
		public static void main (String args[]) {
				Scanner sc = new Scanner(System.in);
				int t = sc.nextInt();
				while(t-->0) {
						int n = sc.nextInt();		
						List<Integer> l = new ArrayList<>();
						for(int i=0;i<n;i++) {
								l.add(sc.nextInt());
						}
						cal(n,l);
				}
		}
}
