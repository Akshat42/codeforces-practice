//QUESTION LINK: https://codeforces.com/problemset/problem/520/A

import java.util.*;

class Panagrams {
		public static String cal(String s,int n) {
				Set<String> set = new HashSet<>();
				for(int i=0;i<n;i++) {
						set.add(Character.toString(s.charAt(i)).toLowerCase());
				}
				if(set.size() == 26)
						return "YES";
				return "NO";
		}
		public static void main (String args[]) {
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				sc.nextLine();
				String s = sc.nextLine();
				System.out.println(cal(s,n));
		}
}
